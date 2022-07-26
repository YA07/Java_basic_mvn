package leetcode_bilibili_zuochengyun.class2;

import com.sun.java.browser.plugin2.liveconnect.v1.Result;
import utils.Constants;

import java.util.Arrays;

/**
 * @Author 17
 * @Description TODO 归并排序
 * @date 2022/7/9 11:05
 * @Version 1.0
 */
public class Demo2 {
    public static void process(int a[],int L,int R){
        if(L==R){
            return;
        }
        int mid = L+((R-L)>>1);
        process(a,L,mid);
        process(a,mid+1, R);
        merge(a,L,mid,R);
    }

    public static void merge(int a[],int L,int M,int R){
        int help[] = new int[R-L+1];
        //[R+L-1]
        int i = 0;
        int p1 = L;
        int p2 = M+1;
        while(p1<=M && p2<=R){
            help[i++] = a[p1]<=a[p2] ? a[p1++] : a[p2++];
        }
        while (p1<=M){
            help[i++] = a[p1++];
        }
        while (p2<=R){
            help[i++] = a[p2++];
        }
        for(i=0;i<help.length;i++){
            a[L+i] = help[i];
        }
    }

    public static void main(String[] args) {
        int[] a = Constants.array_phonenumber;
        Demo2.process(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
