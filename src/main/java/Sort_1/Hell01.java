package Sort_1;

import java.util.Arrays;

public class Hell01 {

    public static void main(String[] args) {

        int a[] = {13,2,6,3,8,6,9,3,9,7};
        sort_(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int a[]){
        int temp = 0;
        for(int gap=a.length/2;gap>0;gap=gap/2){
            for(int i=gap;i<a.length;i++){
                for(int j=i-gap;j>=0;j=j-gap){
                    if(a[j]>a[j+gap]){
                        temp = a[j];
                        a[j] = a[j+gap];
                        a[j+gap] = temp;
                    }
                }
            }
        }
    }

    public static void sort_(int a[]){
        for(int gap=a.length/2;gap>0;gap=gap/2){
            for(int i=gap;i<a.length;i++){
                int j = i;
                int temp = a[j];
                while(j-gap>=0 && temp<a[j-gap]){
                    a[j] = a[j-gap];
                    j = j-gap;
                }
                a[j] = temp;
            }
        }
    }
}
