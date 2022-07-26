package Extends;
class Animal{
    private String name;

    public Animal(){
        System.out.println("父类的无参构造");
    }

    public Animal(String name) {
        System.out.println(name+"的有参构造");
        this.name = name;
    }

}

class Dog extends Animal{
    public Dog(){
        System.out.println("子类的无参构造");
    }

    public Dog(String name) {
        super("dog");
        System.out.println(name+"的有参构造");

    }

}

public  class ExtendDemo{
    public static void main(String[] args) {
        Animal animal = new Animal("父类animal");
        Dog dog = new Dog("子类dog");
    }
}

