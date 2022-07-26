package BuferedReader;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {
    String filepath = "d://1.txt";
    BufferedReader bufferedReader = null;
    @Test
    public void readByChar(){
        try {
            bufferedReader = new BufferedReader(new FileReader(filepath));
            if(!bufferedReader.ready()){
                System.out.println("文件流暂时无法读取");
                return;
            }
            int result = 0;
            while((result = bufferedReader.read())!= -1){
                System.out.print((char)result);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void readByChar_(){
        try {
            int readLen = 0;
            char[] buf = new char[10];
            bufferedReader = new BufferedReader(new FileReader(filepath));
            if(bufferedReader.ready()==false){
                System.out.println("文件流暂时无法读取");
                return;
            }
            while((readLen = bufferedReader.read(buf))!=-1){
                System.out.print(new String(buf,0,readLen));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void readByLine(){
        try {
            int readLen = 0;
            String line;
            bufferedReader = new BufferedReader(new FileReader(filepath));
            if(bufferedReader.ready()==false){
                System.out.println("文件流暂时无法读取");
                return;
            }
            while((line = bufferedReader.readLine())!=null){
                System.out.print(line + '\n');
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
