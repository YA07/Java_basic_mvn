package ObjectOutputStream;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectOutputStreamDemo {
    String filepath = "d://test//1.dat";
    ObjectOutputStream objectOutputStream = null;

    @Test
    public void test(){
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(filepath));
            objectOutputStream.writeInt(100);
            objectOutputStream.writeBoolean(true);
            objectOutputStream.writeChar('a');
            objectOutputStream.writeDouble(9.5);
            objectOutputStream.writeUTF("qerq");

            objectOutputStream.writeObject(new Dog("狗狗",3));

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

class Dog implements Serializable {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}