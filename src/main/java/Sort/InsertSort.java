package Sort;

import java.util.Arrays;

public class InsertSort {

    public static void main(String[] args) {
        int a[] = {7,4,2,8,6,5,9};
        sort(a);
    }

    public static void  sort(int[] a){
        int count = 0;
        for(int i = 1;i<a.length;i++){
            int insertVal = a[i];
            int insertIndex = i-1;
            while(insertIndex >= 0 && insertVal < a[insertIndex]){
                a[insertIndex+1]=a[insertIndex];
                insertIndex--;
            }
            a[insertIndex+1] = insertVal;
            count++;
            System.out.println("第"+count+"轮排序结果 "+Arrays.toString(a));
        }




    }
}
