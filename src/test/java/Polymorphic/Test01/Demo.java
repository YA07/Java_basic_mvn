package Polymorphic.Test01;

public class Demo {
    public static void main(String[] args) {
        Sub s = new Sub();
        System.out.println(s.count); //20
        s.dispaly();
        Base b = s;
        System.out.println(s==b); //true
        System.out.println(b.count);//10
        b.display();
    }
}

class Base{
    int count = 10;
    public void display(){
        System.out.println(this.count);
    }
}

class Sub extends Base{
    int count = 20;
    public void dispaly(){
        System.out.println(this.count);
    }
}

