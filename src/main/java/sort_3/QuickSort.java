package sort_3;

import java.util.Arrays;

/**
 * @Coder 17
 * @ClassName QuickSort
 * @Description TODO
 * @date 2022/5/5 20:41
 * @Version 1.0
 */
public class QuickSort {
    public static void main(String[] args) {
        int a[] = {4,3,2,5,8,7,6,1,4,9};
        sort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int a[],int low,int high){
        if(low>high)
            return;
        
        int i = low;
        int j = high;
        int temp = 0;
        int aim = a[low];

        while(i<j){
            while (a[j]>=aim && i<j){
                j--;
            }
            while(a[i]<=aim && i<j){
                i++;
            }

            if(i<j){
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        a[low] = a[i];
        a[i] = aim;

        sort(a,low,j-1);
        sort(a,j+1,high);
    }
}
