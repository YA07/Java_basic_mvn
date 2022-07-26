package Sort;

import java.util.Arrays;

public class SelectSort {

    public static void main(String[] args) {
        int[] arr = {1,3,1,5,7,65,4,25,67};
        sort(arr);
    }

    public static void sort(int[] array){
        int len = array.length;
        //int min = array[0];
        for(int j=0;j<len;j++){
            for(int i=j+1;i<len;i++){
                int temp = 0;
                if(array[i]<array[j]){
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }


        System.out.println(Arrays.toString(array));
    }
}
