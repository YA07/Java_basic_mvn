package ObjectInputStream;

import org.junit.Test;

import java.io.*;

public class ObjectIputStreamDemo {
    String filepath = "d://test//1.dat";
    ObjectInputStream objectInputStream = null;

    @Test
    public void test(){
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(filepath));
            System.out.println(objectInputStream.readInt());
            System.out.println(objectInputStream.readBoolean());
            System.out.println(objectInputStream.readChar());
            System.out.println(objectInputStream.readDouble());
            System.out.println(objectInputStream.readUTF());

            Object o =  objectInputStream.readObject();
            System.out.println(o.getClass());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
