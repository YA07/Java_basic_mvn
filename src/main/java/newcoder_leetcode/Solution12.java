package newcoder_leetcode;

/**
 * @Author 17
 * @Description TODO  青蛙跳台阶
 * @date 2022/8/13 16:59
 * @Version 1.0
 */
public class Solution12 {
    public int jumpFloor(int target) {
        int res = 0;

        // res = f1(target);

        int record[] = new int[target+1];
        for(int i=0;i<target+1;i++){
            record[i] = -1;
        }
        if(target==0){
            record[0]=0;
        }
        if(target==1){
            record[1]=1;
        }
        if(target==2){
            record[2]=2;
        }
        if(target>2){
            record[0] = 0;
            record[1] = 1;
            record[2] = 2;
        }
        res = f2(target,record);
        return res;
    }

    //递归
    public int f1(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        return f1(n-1)+f1(n-2);
    }

    //记忆化搜索
    public int f2(int n,int[] record){
        if(record[n]!=-1){
            return record[n];
        }

        record[n] = f2(n-1,record)+f2(n-2,record);
        return record[n];
    }

    public static void main(String[] args) {
        Solution12 s = new Solution12();
        int target = 1;
        System.out.println(s.jumpFloor(target));
    }
}
