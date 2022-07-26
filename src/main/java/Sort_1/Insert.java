package Sort_1;

import java.util.Arrays;

public class Insert {
    public static void main(String[] args) {
        int a[] = {101,34,119,1};
        sort(a);
        System.out.println(Arrays.toString(a));

    }

    public static void sort(int a[]){
        //{101,34,119,1}  => {34,101,119,1}

        for(int i=1;i<a.length;i++){
            int insertVal = a[i];
            int insertIndex = i-1;

            while(insertIndex>=0 && insertVal<a[insertIndex]){
                a[insertIndex+1] = a[insertIndex];
                insertIndex--;
            }

            a[insertIndex+1] = insertVal;
        }

    }
}
