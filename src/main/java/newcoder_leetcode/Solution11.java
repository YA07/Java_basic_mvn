package newcoder_leetcode;

import java.util.*;


public class Solution11 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 递增路径的最大长度
     * @param matrix int整型二维数组 描述矩阵的每个数
     * @return int整型
     */
    //  public static int len = 0;
    public int solve (int[][] matrix) {
        // write code here
        int len = 0;
        int temp = 0;

        int row = matrix.length;
        int col = matrix[0].length;
        int[][] record = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                record[i][j]=0;
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                process(matrix,i,j,record);
                len = computeLength(record);
                if(len>temp){
                    temp = len;
                }

            }
        }
        return temp;
    }

    public int computeLength(int record[][]){
        int len = 0;
        int row = record.length;
        int col = record[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(record[i][j] == 1){
                    len++;
                }
            }
        }
        return len;
    }

    public void process(int[][] M,int i,int j,int record[][]){

        int row = M.length;
        int col = M[0].length;
        if((i>=row || i<0)||(j>=col || j<0)||M[i][j]==-1){
            return;
        }

        if(i+1<row && M[i+1][j]>M[i][j]){
            M[i][j] = -1;
            record[i][j] = 1;
            process(M,i+1,j,record);
        }else if(i-1>0 && M[i-1][j]>M[i][j]){
            M[i][j] = -1;
            record[i][j] = 1;
            process(M,i-1,j,record);
        }else if(j-1>0 && M[i][j-1]>M[i][j]){
            M[i][j] = -1;
            record[i][j] = 1;
            process(M,i,j-1,record);
        }else if(j+1<col && M[i][j+1]>M[i][j]){
            M[i][j] = -1;
            record[i][j] = 1;
            process(M,i,j+1,record);
        }else{
            return;
        }

    }

    public static void main(String[] args) {
        Solution11 s = new Solution11();
        int m[][] = {{1,2,3},{4,5,6}};
        System.out.println(s.solve(m));
    }
}