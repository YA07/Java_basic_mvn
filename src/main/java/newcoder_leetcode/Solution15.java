package newcoder_leetcode;

/**
 * @Author 17
 * @Description TODO
 * @date 2022/8/17 14:53
 * @Version 1.0
 */
public class Solution15 {
    /**
     *
     * @param m int整型
     * @param n int整型
     * @return int整型
     */
    public int uniquePaths (int m, int n) {
        // write code here
        if(m==0 || n==0)
            return 1;

        int dp[][] = new int[m+1][n+1];
        for(int i=0;i<m+1;i++){
            dp[0][i] = 1;
            dp[i][0] = 1;
        }

        for(int i=1;i<m+1;i++)
            for(int j=1;j<n+1;j++){
                dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }

        return dp[m-1][n-1];
    }

//    public int process(int i,int j){
//        if(i==1 && j==0){
//            return 1;
//        }
//        if(i==0 && j==1){
//            return 1;
//        }
//
//        if(i==1 && j==1){
//            return -1;
//        }
//
//        return process(i-1,j)+process(i,j-1);
//    }

    public static void main(String[] args) {
        Solution15 s = new Solution15();
        System.out.println(s.uniquePaths(3,7));
    }
}
