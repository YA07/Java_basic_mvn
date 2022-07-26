package Debug;

import java.util.Arrays;

public class Debug03 {
    public static void main(String[] args) {
        int arr[] = {2,14,5,9,6,7,4};
        Arrays.sort(arr);
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
