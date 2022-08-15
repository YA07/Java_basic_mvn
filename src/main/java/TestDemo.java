import leetcode_bilibili_zuochengyun.Class6.Test;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class TestDemo {
    public static void main(String[] args) {
        int a=5;
        int b=3;
        int c=0;
        int way1 = 0;
        int way2 = 0;
        int way3 = 0;
        if(a>c){
            way1++;
            System.out.println("way1 "+way1);
        }else if(a>b){
            way2++;
            System.out.println("way2 "+way1);
        }else if(b<c){
            way3++;
            System.out.println("way3 "+way1);
        }else{
            System.out.println("over");
        }
    }
}




