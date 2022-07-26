package Sort_2;

import java.util.Arrays;

/**
 * @Coder 17
 * @ClassName HellSort
 * @Description TODO
 * @date 2022/4/30 21:17
 * @Version 1.0
 */
public class HellSort {
    public static void main(String[] args) {
        int a[] = {1,4,2,6,3,6,0,5,9,7};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int a[]){

        int temp = 0;
        for(int i=5;i<a.length;i++){
            for(int j=i-5;j>=0;j-=5){
                if(a[j]>a[j+5]){
                    temp = a[j];
                    a[j] = a[j+5];
                    a[j+5] = temp;
                }
            }
        }

        for(int i=2;i<a.length;i++){
            for(int j=i-2;j>=0;j-=2){
                if(a[j]>a[j+2]){
                    temp = a[j];
                    a[j] = a[j+2];
                    a[j+2] = temp;
                }
            }
        }

    }
}
