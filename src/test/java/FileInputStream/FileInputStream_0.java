package FileInputStream;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream_0 {
    FileInputStream fileInputStream = null;
    String filepath = "d://1.txt";
    int readData = 0;
    @Test
    public void readfile(){
        try {
            fileInputStream = new FileInputStream(filepath);
            while ((readData = fileInputStream.read())!= -1){
                System.out.print((char)readData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
