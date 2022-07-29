package newcoder_leetcode;

import java.util.ArrayList;

/**
 * @Author 17
 * @Description TODO
 * @date 2022/7/29 15:48
 * @Version 1.0
 */
public class Solution6 {
    ArrayList<String> res = new ArrayList();
    public ArrayList<String> Permutation(String str) {

        if(str==null || str.length()==0){
            return res;
        }

        char[] chs = str.toCharArray();
        process(0,chs);
        return res;

    }

    public void process(int i,char[] chs){
        String str;
        if(i==chs.length){
            str = String.valueOf(chs);
            if(chs[chs.length-1]==0){
                str.substring(0,str.length()-1);
            }
            res.add(str);
            return;
        }
        process(i+1,chs);
        char temp = chs[i];
        chs[i] = 0;

        process(i+1,chs);
        chs[i] = temp;
    }

    public static void main(String[] args) {
        Solution6 s = new Solution6();
        ArrayList<String> res = s.Permutation("abc");
        System.out.println(res);
    }
}
