package Polymorphic.Demo;

public class Phoy_01 {
    public static void main(String[] args) {
        Master master = new Master("黑蛋");
        Dog dog = new Dog("大黄狗");
        Bone bone = new Bone("骨头");

        Cat cat = new Cat("小黄猫");
        Fish fish = new Fish("烤鱼");

        master.feed(dog,bone);
        master.feed(cat,fish);
    }
}

