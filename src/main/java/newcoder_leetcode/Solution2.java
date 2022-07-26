package newcoder_leetcode;

import java.util.Arrays;

/**
 * @Coder 17
 * @ClassName Solution2
 * @Description TODO 最小的k个数
 * @date 2022/6/11 19:37
 * @Version 1.0
 */
public class Solution2 {
    public void quickSort(int array[],int low,int high,int k){
        if(low>high)
            return;
        int pivot = array[low];
        int l = low;
        int r = high;
        int temp = 0;
        while(l<r){
            while (l < r && array[r] >= pivot) {
                r--;
            }
            while (l < r && array[l] <= pivot) {
                l++;
            }
            if(l<r){
                temp = array[l];
                array[l] = array[r];
                array[r] = temp;
            }
        }

        array[low] = array[l];
        array[l] = pivot;

        System.out.println(Arrays.toString(array));
        if(l == k)
            System.out.println(array[k]);

        if(low<l){
            quickSort(array,low,l-1,k);
        }
        if(high>r){
            quickSort(array,r+1,high,k);
        }

    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int array[] = {5,4,6,8,9,1,2};
        //int k = 3;
        s.quickSort(array,0,array.length-1,3);
        //System.out.println(k);

    }
}
