package leetcode_bilibili_zuochengyun.Class8;

public class QueensProblem {
    public static int num1(int n){
        if(n<0)
            return 0;
        int[] record = new int[n];
        return process1(0,record,n);
    }

    public static int process1(int i,int[] record,int n){
        if(i==n){
            return 1;
        }
        int res = 0;
        for (int j = 0; j < n; j++) {
            if(isValid(record,i,j)){
                record[i] = j;
                res += process1(i+1,record,n);
            }
        }
        return res;
    }

    public static boolean isValid(int[] record,int i,int j){
        for (int k = 0; k < i; k++) {
            if(j==record[k] || Math.abs(record[k]-j)==Math.abs(i-k)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(num1(5));
    }
}
