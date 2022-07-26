package FileOutputStream;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_ {
    FileOutputStream fileOutputStream = null;
    String filepath = "d://1.txt";
    @Test
    public void writedata(){
        try {
            String str = new String("abc");
            fileOutputStream = new FileOutputStream(filepath,true);
            fileOutputStream.write(str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
