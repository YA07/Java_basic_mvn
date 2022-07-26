package FileInputStream;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_1 {
    FileInputStream fileInputStream = null;
    String filepath = "d://1.txt";
    int readlen = 0;
    byte[] str = new byte[10];

    @Test
    public void readfile(){
        try {
            fileInputStream = new FileInputStream(filepath);
            while ((readlen=fileInputStream.read(str))!=-1){
                System.out.print(new String(str,0,readlen));

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
