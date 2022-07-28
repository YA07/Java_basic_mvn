package leetcode_bilibili_zuochengyun.Class9;

import javax.crypto.spec.PSource;
import java.util.Arrays;

public class Demo {
    public static void sort(int[] a,int low,int high){
        if(low>high){
            return;
        }

        int l = low;
        int r = high;
        int temp = a[low];

        while (l<r){
            while (l<r && a[r]>=temp)
                r--;
            while (l<r && a[l]<=temp)
                l++;
            if(l!=r){
                int t = a[l];
                a[l] = a[r];
                a[r] = t;
            }
        }
        a[low] = a[l];
        a[l] = temp;


        //左递归
        sort(a,low,l-1);
        sort(a,l+1,high);
    }

    public static void main(String[] args) {
        int a[] = {3,5,0,8,4,2};
        sort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
