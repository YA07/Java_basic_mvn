package DP;

/**
 * @Coder 17
 * @ClassName HasPath
 * @Description TODO
 * @date 2022/5/10 20:29
 * @Version 1.0
 */
//   a b c e
//   s f c s
//   a d e e      abcced
public class HasPath {
    public static boolean hasPath(char[][] matrix,String word){
        char[] words = word.toCharArray();
        for(int i=0;i<=matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(dfs(matrix,words,i,j,0))
                    return true;

            }
        }
        return false;
    }

    public static boolean dfs(char[][] matrix, char[] words, int i, int j, int index){
        if(i>=matrix.length || i<0 || j>=matrix[0].length || j<0 || matrix[i][j]!=words[index]){
            return false;
        }
        if(index==words.length-1)
            return true;
        char tmp = matrix[i][j];
        matrix[i][j] = '.';
        boolean res = dfs(matrix,words,i+1,j,index+1)
                || dfs(matrix,words,i+1,j,index+1)
                || dfs(matrix,words,i,j-1,index+1)
                || dfs(matrix,words,i,j+1,index+1);
        matrix[i][j] = tmp;
        return res;
    }

    public static void main(String[] args) {
        char[][] matrix = {{'a','b','c','e'},{'s','f','c','s'},{'a','d','e','e'}};
        String words = "abcced";
       // System.out.println(matrix);
        System.out.println(hasPath(matrix,words));
    }
}
