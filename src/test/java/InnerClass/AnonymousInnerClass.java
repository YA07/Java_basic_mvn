package InnerClass;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();


    }
}

class Outer04{
    private int n1 = 10;
    public void  method(){
       Father father = new Father("yao"){
           @Override
           public void test() {
               System.out.println("匿名内部类中的test方法");
           }
       };
       father.test();
    }
}

interface  A{
    public void cry();
}

class Father{
    public Father(String name){

    }
    public void test(){
        System.out.println("father的test方法");
    }
}