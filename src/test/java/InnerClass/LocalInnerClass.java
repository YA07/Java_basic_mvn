package InnerClass;

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.m1();
    }
}

class Outer02{
    private int n1 = 100;

    public void m2(){
        System.out.println("Outer02的m2()");
    }
    public   void m1(){
        class Inner02{
            public void f1(){
                System.out.println("n1="+ n1);
                m2();
            }
        }

        Inner02 inner02 = new Inner02();
        inner02.f1();
    }
}
