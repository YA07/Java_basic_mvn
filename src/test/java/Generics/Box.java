package Generics;

import org.junit.Test;

public class Box<T>{
    private T t;
    public void add(T t){
        this.t=t;
    }
    public T getT(){
        return t;
    }

    @Test
    public void testGenerics(){
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

        integerBox.add(new Integer(10));
        stringBox.add(new String("abc"));

        System.out.println(integerBox.getT());
        System.out.println(stringBox.getT());
    }
}
