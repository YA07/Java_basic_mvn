package Sort_1;

import java.util.Arrays;

public class Select {
    public static void main(String[] args) {
        int a[] = {5,6,3,7,8,1};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int a[]){
        //第一次
        int temp = 0;
        for(int j=0;j<a.length;j++){
            for(int i=j;i<a.length;i++){
                if(a[i]<a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

}
