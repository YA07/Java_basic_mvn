package Sort_1;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int a[] = {5,6,3,7,8,1};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int a[]){
        for(int j =0 ;j<a.length;j++){
            int flag = 0;
            for(int i=a.length-1;i>0;i--){
                int temp = 0;
                if(a[i]<a[i-1]){
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
