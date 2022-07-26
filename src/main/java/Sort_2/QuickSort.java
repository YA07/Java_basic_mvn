package Sort_2;

import java.util.Arrays;

public class QuickSort {
    public static void sort(int a[],int low,int high){
        int i,j,temp,t;
        if(low>high)
            return;
        i = low;
        j = high;
        temp = a[low];//temp就是基准位
        while (i<j){
            //先看右边
            while (temp<=a[j] && i<j){
                j--;
            }
            while (temp>=a[i] && i<j){
                i++;
            }
            if(i<j){
                t = a[j];
                a[j] = a[i];
                a[i] = t;
            }
        }
        //最后把基准位置与i,j相等的位置互换
        a[low] = a[i];
        a[i] = temp;

        sort(a,low,j-1);
        sort(a,j+1,high);
    }

    public static void main(String[] args) {
        int a[] = {6,1,2,7,9,3,4,5,10,8};
        sort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
