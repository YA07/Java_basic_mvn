package Sort_2;

import java.util.Arrays;

/**
 * @Coder 17
 * @ClassName InsertSort
 * @Description TODO
 * @date 2022/5/2 21:08
 * @Version 1.0
 */
public class InsertSort {
    public static void main(String[] args) {
        int a[] = {101,34,119,1};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int a[]){

        //int insertVal = a[1];
       // int insertIndex = 1-1;

//        while (insertIndex>=0 && insertVal<a[insertIndex]){
//            a[insertIndex+1] = a[insertIndex];
//            insertIndex--;
//        }
//        a[insertIndex+1] = insertVal;

        for(int i = 1;i<a.length;i++){
            int insertVal = a[i];
            int insertIndex = i-1;
            while (insertIndex>=0 && insertVal<a[insertIndex]){
                a[insertIndex+1] = a[insertIndex];
                insertIndex--;
            }
            a[insertIndex+1] = insertVal;
        }
    }
}
