package FileWriter;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    String filepath = "d://1.txt";
    FileWriter fileWriter = null;
    @Test
    public void writeFile(){
        try {
            fileWriter = new FileWriter(filepath);
            fileWriter.write("123eqwrq你好");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
