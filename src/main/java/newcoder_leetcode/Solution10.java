package newcoder_leetcode;

import java.util.ArrayList;

/**
 * @Author 17
 * @Description TODO BM46 最小的K个数
 * @date 2022/8/7 16:41
 * @Version 1.0
 */
public class Solution10 {

    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList();
        return quickSort(input,0,input.length-1,k);
    }

    public static ArrayList<Integer> quickSort(int a[],int left,int right,int key){
        int l = left;
        int r = right;
        int pivot = a[left];
        ArrayList<Integer> res = new ArrayList();
        if(l>r){
            for(int i=0;i<key;i++){
                res.add(a[i]);
            }
            return res;
        }

        while(l<r){
            while(a[r]>=pivot&&l<r){
                r--;
            }
            while(a[l]<=pivot&&l<r){
                l++;
            }
            if(l<r){
                int temp = a[r];
                a[r] = a[l];
                a[l] = temp;
            }
        }

        a[left] = a[l];
        a[l] = pivot;

        if(l==key-1){
            for(int i=0;i<key;i++){
                res.add(a[i]);
            }
            return res;
        }

        quickSort(a,left,r-1,key);
        quickSort(a,r+1,right,key);

        return res;
    }

    public static void main(String[] args) {
        int input[] = {1,2,3,4,5,6,7,8};
        ArrayList<Integer> res = GetLeastNumbers_Solution(input, 8);
        System.out.println(res);
    }
}
