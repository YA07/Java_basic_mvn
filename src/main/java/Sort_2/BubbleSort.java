package Sort_2;

import java.util.Arrays;

/**
 * @Coder 17
 * @ClassName BubbleSort
 * @Description TODO
 * @date 2022/4/30 21:06
 * @Version 1.0
 */
public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {1,4,2,6,3,6,0,5,9};
        sort(a);
        System.out.println(Arrays.toString(a));

    }

    public static void sort(int a[]){
        int temp = 0;
        for(int j=0;j<a.length;j++){
            int flag = 0;
            for(int i=a.length-1;i>0;i--){
                if(a[i]>a[i-1]){
                    temp = a[i];
                    a[i] = a[i-1];
                    a[i-1] = temp;
                    flag = 1;
                }
            }
            if(flag == 0) break;
        }
    }
}
