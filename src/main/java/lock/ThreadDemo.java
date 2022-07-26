package lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Coder 17
 * @ClassName ThreadDemo
 * @Description TODO
 * @date 2022/5/15 12:23
 * @Version 1.0
 */
public class ThreadDemo {
    public static void main(String[] args) {
        ShareResource shareResource = new ShareResource();
        new Thread(()->{
            for (int i = 1 ; i <=5 ; i++) {
                try {
                    shareResource.pint5(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"AA").start();;

        new Thread(()->{
            for (int i = 1 ; i <=10 ; i++) {
                try {
                    shareResource.pint5(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"BB").start();;

        new Thread(()->{
            for (int i = 1 ; i <=15 ; i++) {
                try {
                    shareResource.pint5(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"CC").start();;
    }

}

class ShareResource{
    private int flag = 1;
    private Lock lock = new ReentrantLock();
    private Condition c1 = lock.newCondition();
    private Condition c2 = lock.newCondition();
    private Condition c3 = lock.newCondition();

    public void pint5(int loop) throws InterruptedException {
        lock.lock();
        try{
            while (flag!=1){
                c1.await();
            }
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName()+":"+i+"loop:"+loop);
            }
            flag=2;
            c2.signal();
        }finally {
            lock.unlock();
        }
    }

    public void pint10(int loop) throws InterruptedException {
        lock.lock();
        try{
            while (flag!=2){
                c2.await();
            }
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName()+":"+i+"loop:"+loop);
            }
            flag=3;
            c3.signal();
        }finally {
            lock.unlock();
        }
    }

    public void pint15(int loop) throws InterruptedException {
        lock.lock();
        try{
            while (flag!=3){
                c3.await();
            }
            for (int i = 1; i <= 15; i++) {
                System.out.println(Thread.currentThread().getName()+":"+i+"loop:"+loop);
            }
            flag=1;
            c1.signal();
        }finally {
            lock.unlock();
        }
    }
}
