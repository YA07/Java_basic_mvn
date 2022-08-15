package newcoder_leetcode;
//BM70 兑换零钱(一)
public class Solution13 {
    public static int minMoney (int[] arr, int aim) {
        // write code here
        // int count = 0;
        return process1(arr,aim,0);
    }

    public static int process1(int[] arr,int aim,int count){
        int c = count;
        if(aim<0){
            return -1;
        }

        if(aim==0){
            return 1;
        }

        int min = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            process1(arr,aim-arr[i],c);
            c++;
        }

        return c+1;
    }

    public static void main(String[] args) {
        int a[] = {3,5};
        System.out.println(minMoney(a,2));
    }






}
