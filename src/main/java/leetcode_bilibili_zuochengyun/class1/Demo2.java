package leetcode_bilibili_zuochengyun.class1;

import utils.Constants;

import java.util.Arrays;

/**
 * @Author 17
 * @Description TODO 排序
 * @date 2022/7/8 11:34
 * @Version 1.0
 */
public class Demo2 {
    //插入排序
    public static void insertSort(int a[]){
        for(int i=1;i<a.length;i++){
            int insertVal = a[i];
            int insertIndex = i-1;

            while (insertIndex>=0 && insertVal<a[insertIndex]){
                a[insertIndex+1] = a[insertIndex];
                insertIndex--;
            }
            a[insertIndex+1] = insertVal;
        }
    }

    //快速排序
    public static void quickSort(int a[],int L,int R){
        int i,j,temp,t;
        if(L>R)
            return;
        i=L;
        j=R;
        temp = a[L];

       while(i<j){
           while (a[j]>=temp && i<j){
               j--;
           }
           while(a[i]<=temp && i<j){
               i++;
           }
           if(i<j){
               t = a[j];
               a[j] = a[i];
               a[i] = t;
           }
       }

        a[L] = a[i];
        a[i] = temp;

        //System.out.println(a);

        quickSort(a,L,i-1);
        quickSort(a,i+1,R);
    }

    public static void main(String[] args) {
        int a[] = Constants.array_phonenumber;
        Demo2.quickSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));

    }
}
