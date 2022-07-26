package Sort;

import java.util.Arrays;

public class HellSort {
    public static void main(String[] args) {
        int a[] = {13,2,6,3,8,6,9,3,9,7};
        sort(a);
    }
    public static void sort(int a[]){

        int len = a.length;
        int temp = 0;
        int gap = len/2;
        for(int k = gap; k > 0; k = k/2){
            for(int i=k;i<len;i++){
                for(int j=i-k;j>=0;j=j-k){
                    if(a[j]>a[j+k]){
                        temp = a[j];
                        a[j] = a[j+k];
                        a[j+k] = temp;
                    }
                }
            }
        }
        System.out.println("希尔排序： "+ Arrays.toString(a));


    }
}
