package Thread;

public class JoinDemo {
    public static void main(String[] args) {

    }
}

class T extends Thread{
    @Override
    public void run() {
        for(int i=1;i<=20;i++){
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("join thread"+i);
        }
    }
}