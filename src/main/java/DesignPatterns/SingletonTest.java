package DesignPatterns;
//饿汉式

//对某个类只能存在一个对象实例
public class SingletonTest {


    public static void main(String[] args) {
        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();
        System.out.println(bank1 == bank2);
    }

}

class Bank{
    //私有化类的构造器
    private Bank(){

    }

    //内部创建类的对象
    private static Bank instance = new Bank();

    //提供公共方法，返回类对象
    public static Bank getInstance(){
        return instance;
    }

}
