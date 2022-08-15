package leetcode_bilibili_zuochengyun.class15;

/**
 * @Author 17
 * @Description TODO  机器人移动问题
 * @date 2022/8/10 14:39
 * @Version 1.0
 */
public class Demo1 {
    //基础，暴力递归
    public static int walksWays(int N,int P,int M,int K){
        return f(N,P,K,M);
    }

    public static int f(int N,int E,int rest,int cur){
        if(rest == 0){
            return cur == E ? 1:0;
        }
        if(cur == 1){
            return f(N,E,rest-1,2);
        }
        if(cur == N){
            return f(N,E,rest-1,N-2);
        }
        return f(N,E,rest-1,cur+1)+f(N,E,rest-1,cur-1);
    }

    //进阶，记忆化搜索
    public static int walksWays1(int N,int P,int M,int K){
        int[][] dp = new int[K+1][N+1];
        for(int i=0;i<=K;i++){
            for(int j=0;j<=N;j++){
                dp[i][j] = -1;
            }
        }
        return f1(N,P,K,M,dp);
    }

    public static int f1(int N,int E,int rest,int cur,int dp[][]){
        if(dp[rest][cur]!=-1){
            return dp[rest][cur];
        }
        if(rest == 0){
            return cur == E ? 1:0;
        }
        if(cur == 1){
            dp[rest][cur] =  f1(N,E,rest-1,2,dp);
        }
        if(cur == N){
            dp[rest][cur] =  f1(N,E,rest-1,N-2,dp);
        }
        dp[rest][cur] = f1(N,E,rest-1,cur+1,dp)+f1(N,E,rest-1,cur-1,dp);
        return dp[rest][cur];
    }

    //终极 动态规划
    public static  int dpWay(int N,int P,int M,int K){
        int[][] dp = new int[K+1][N+1];
        dp[0][P] = 1;
        for(int rest=1;rest<K+1;rest++){
            for(int cur=1;cur<N+1;cur++){
                if(cur==1){
                    dp[rest][cur]=dp[rest-1][2];
                }else if(cur==N){
                    dp[rest][cur]=dp[rest-1][N-1];
                }else {
                    dp[rest][cur]=dp[rest-1][cur-1]+dp[rest-1][cur+1];
                }
            }
        }
        return  dp[M][K];

    }
}
