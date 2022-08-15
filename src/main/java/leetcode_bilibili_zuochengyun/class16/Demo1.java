package leetcode_bilibili_zuochengyun.class16;

//兑换货币的方法数
public class Demo1 {
    //方法一 暴力递归
    public static int way1(int a[],int target){
        return process1(a,0,target);
    }
    public static int process1(int a[],int index,int rest){
        if(index==a.length){
            return rest==0 ? 1 : 0;
        }

        //zhang  纸币张数
        int ways = 0;
        for(int zhang=0;zhang*a[index]<=rest;zhang++){
            ways += process1(a,index+1,rest-a[index]*zhang);
        }

        return ways;
    }

    //方法二 动态规划
    public static int way2(int a[],int aim){
        int N = a.length;
        int dp[][] = new int[a.length+1][aim+1];

        dp[N][0] = 1;
        for(int i=1;i<=aim;i++)
            dp[N][i] = 0;

        for(int index = N-1;index >= 0;index--){
            for(int rest = 0;rest <= aim;rest++){
                int ways = 0;
                for(int zhang=0;zhang*a[index]<=rest;zhang++){
                    ways += dp[index+1][rest-a[index]*zhang];
                }
                dp[index][rest] = ways;
            }
        }

        return dp[0][aim];
    }



    public static void main(String[] args) {
        int a[] = {1,2,3};
        //int target = 3;
        System.out.println("暴力递归: "+way1(a,3));
        System.out.println("动态规划: "+way2(a,3));
    }

}
