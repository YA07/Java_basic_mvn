package Sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {2,0,2,1,1,0};
        sortColors(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sortColors(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=nums.length-1;j>0;j--){
                if(nums[j-1]<nums[j]){
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
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
