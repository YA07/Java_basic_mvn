package JUC;

import java.util.concurrent.CountDownLatch;

/**
 * @Coder 17
 * @ClassName CountDownLatchDemo
 * @Description TODO
 * @date 2022/5/21 20:35
 * @Version 1.0
 */
public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(6);

        for (int i = 1; i <= 6; i++) {
            new Thread(()->{
                System.out.println(Thread.currentThread().getName());
                countDownLatch.countDown();
            },String.valueOf(i)).start();
        }
        countDownLatch.await();
        System.out.println("over");
    }
}
