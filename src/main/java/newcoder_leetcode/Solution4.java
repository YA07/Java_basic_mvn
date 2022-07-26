package newcoder_leetcode;

import java.util.Arrays;

/**
 * @Coder 17
 * @ClassName Solution4
 * @Description TODO 数据流中的中位数 插入排序
 * @date 2022/6/14 18:13
 * @Version 1.0
 */
public class Solution4 {
    public static void main(String[] args) {
        int a[] = {5,2,1,4};
        int insertVal;
        int insertIndex;
        for (int i=1;i<a.length;i++){
            insertVal = a[i];
            insertIndex = i-1;
            while(insertIndex>=0 && a[insertIndex]>insertVal){
                a[insertIndex+1] = a[insertIndex];
                insertIndex--;
            }
            a[insertIndex+1] = insertVal;
            System.out.println(Arrays.toString(a));
        }

//        int insertVal = a[1];
//        int insertIndex = 1-1;
//        while(insertIndex>=0 && a[insertIndex]>a[1]){
//            a[insertIndex+1] = a[insertIndex];
//            insertIndex--;
//        }
//        a[insertIndex+1] = insertVal;
        System.out.println(Arrays.toString(a));





    }

    public void insertSort(int a[]){

    }
}
