package Sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {49,38,65,97,76,13,27,49};
        sort(a);

    }

    public static void sort(int a[]){
        int flag = 0;
        int temp = 0;
        for(int i = 0;i < a.length;i++){
            flag = 0;
            for(int j = a.length-1;j > 0;j--){
                if(a[j-1] > a[j]){
                    temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                    flag = 1;
                }
            }
            if(flag == 0){
                break;
            }
            System.out.println(Arrays.toString(a));
        }
    }
}
