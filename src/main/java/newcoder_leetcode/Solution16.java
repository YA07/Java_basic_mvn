package newcoder_leetcode;

/**
 * @Author 17
 * @Description TODO BM68 矩阵的最小路径和
 * @date 2022/8/17 15:53
 * @Version 1.0
 */
public class Solution16 {
    /**
     *
     * @param matrix int整型二维数组 the matrix
     * @return int整型
     */
    public int minPathSum (int[][] matrix) {
        // write code here

        int row = matrix.length;
        int col = matrix[0].length;

//        int[][] record = new int[row][col];
//        for (int i = 0; i < row; i++){
//            for (int j = 0; j < col; j++) {
//                record[i][j] = -1;
//            }
//        }
        //record[0][0] = matrix[0][0];
       // return process(matrix,row-1,col-1,record);

        int[][] dp = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==0 && j==0){
                    dp[i][j] = matrix[i][j];
                }else if(i==0){
                    dp[i][j] = matrix[i][j]+dp[i][j-1];
                }else if(j==0){
                    dp[i][j] = matrix[i][j]+dp[i-1][j];
                }else {
                    dp[i][j] = matrix[i][j]+Math.min(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[row-1][col-1];
    }


//    public int process(int[][] m,int i,int j,int[][] record){
//        if(record[i][j] != -1){
//            return record[i][j];
//        }
//
//        if(i==0 && j==0){
//            record[i][j] = m[i][j];
//            return record[i][j];
//        }
//        if(i==0){
//            record[i][j] = m[i][j]+process(m,i,j-1,record);
//        }else if(j==0){
//            record[i][j] = m[i][j]+process(m,i-1,j,record);
//        }else {
//            record[i][j] =  m[i][j]+Math.min((process(m,i-1,j,record)),(process(m,i,j-1,record)));
//        }
//
//        return record[i][j];
//    }


    public static void main(String[] args) {
        Solution16 s = new Solution16();
        int m[][] = {{1,3,5,9},{8,1,3,4}};
        System.out.println(s.minPathSum(m));
    }

}
