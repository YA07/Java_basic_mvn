package leetcode_bilibili_zuochengyun.Class9;

import java.util.ArrayList;

/**
 * @Author 17
 * @Description TODO
 * @date 2022/7/29 10:52
 * @Version 1.0
 */
public class PrintAllPermutation_ {

    public static void process(int i, char[] chs){
        if(i==chs.length){
            String str = String.valueOf(chs);
            System.out.println(str);
        }
        for (int j = i; j < chs.length; j++) {
            swap(i,j,chs);
            process(i+1,chs);
            swap(i,j,chs);
        }
    }

    public static void swap(int i,int j,char[] ch){
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }

    public static void main(String[] args) {
        char[] chs = {'a','b','c','d'};
        process(0,chs);
    }
}
