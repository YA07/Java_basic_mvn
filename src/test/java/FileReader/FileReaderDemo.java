package FileReader;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

    String filepath = "d://1.txt";
    FileReader fileReader = null;
    int data = 0;
    int len = 0;

    @Test
    public void readFile(){
        try {
            fileReader = new FileReader(filepath);
            while((data =  fileReader.read())!=-1){
                System.out.print((char)data);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void readFile_1(){
        char[] buf = new char[8];
        try {
            fileReader = new FileReader(filepath);

            while((len=(fileReader.read(buf)))!=-1){
                System.out.print(new String(buf,0,len));

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
