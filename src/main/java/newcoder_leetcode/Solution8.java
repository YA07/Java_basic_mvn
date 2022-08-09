package newcoder_leetcode;

import java.util.Stack;

/**
 * @Author 17
 * @Description TODO
 * @date 2022/8/5 14:45
 * @Version 1.0
 */
public class Solution8 {
    public static String trans(String s, int n) {
        // write code here
        char chs[] = s.toCharArray();
        char c[] = new char[chs.length];
        for(int i=0;i<n;i++){
            if(chs[i]<='z' && chs[i]>='a'){
                c[i] = Character.toUpperCase(chs[i]);
            }
            if(chs[i]<='Z' && chs[i]>='A'){
                c[i] = Character.toLowerCase(chs[i]);
            }
            c[i] = chs[i];
        }
        String newstr = String.valueOf(chs);

        String str1[] = newstr.split(" ");
        Stack<String> stack = new Stack();
        for(int i=0;i<str1.length;i++){
            stack.push(str1[i]);
        }

        String str2[]=new String[stack.size()];
        int k=0;
        while(!stack.isEmpty()){
            str2[k] = stack.pop();
            // str2[++k] = " ";
            k++;
        }

        StringBuilder res = new StringBuilder();
        for(int i=0;i<str2.length;i++){
            res.append(str2[i]);
            res.append(" ");
        }

        String str = new String(res);
        return str;
    }

    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(trans(str,11));
    }


}
