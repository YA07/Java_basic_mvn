package newcoder_leetcode;

/**
 * @Author 17
 * @Description TODO
 * @date 2022/8/6 15:06
 * @Version 1.0
 */
public class Solution9 {
    public static String longestCommonPrefix (String[] strs) {
        int[] len = new int[strs.length];
        int temp = Integer.MAX_VALUE;
        int index_i = 0;
        for(int i=0;i<len.length;i++){
            len[i] = strs[i].length();
            if(len[i]<temp){
                index_i = i;
                temp = len[i];
            }
        }
        String flag = strs[index_i];

        for(int i=0;i<strs.length;i++){
            for(int j=0;j<flag.length();j++){
                if(strs[i].charAt(j)!=flag.charAt(j)){
                    //index = j;
                    return flag.substring(0,j);
                }

            }
        }

        return flag;

    }

    public static void main(String[] args) {
        String[] s = {"abca","abc","abca","abc","abcc"};
        String res = longestCommonPrefix(s);
    }
}
