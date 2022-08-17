package newcoder_leetcode;
import java.util.*;
/**
 * @Author 17
 * @Description TODO
 * @date 2022/8/15 17:03
 * @Version 1.0
 */



public class Solution14 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * longest common substring
     * @param str1 string字符串 the string
     * @param str2 string字符串 the string
     * @return string字符串
     */
    public static String LCS (String str1, String str2) {
        // write code here
        int l1 = str1.length();
        int l2 = str2.length();

        int[][] dp = new int[l1+1][l2+1];
        for(int i=0;i<l1;i++){
            for(int j=0;j<l2;j++){
                if(str1.charAt(i)==str2.charAt(j))
                    dp[i][j] = 1;
                else
                    dp[i][j] = 0;
            }
        }

        int len = 0;
        int max = Integer.MIN_VALUE;
        int index = 0;
        for(int i=0;i<l1;i++){
            for(int j=0;j<l2;j++){
                if(dp[i][j]==1){
                    len = 1;
                    int row = i+1;
                    int col = j+1;
                    while (row<l1 && col<l2){
                        if(dp[row][col]==1){
                            len++;
                            row++;
                            col++;

                        }else {
                            break;
                        }
                    }
                    if(max<len){
                        max = len;
                        index = row;
                    }
                }
            }
        }

        System.out.println(index);
        System.out.println(max);
        return str1.substring(index-max,index);

    }

    public static void main(String[] args) {
        String s1 = "13150250";
        String s2 = "12151250";
        System.out.println(LCS(s1,s2));
    }
}
