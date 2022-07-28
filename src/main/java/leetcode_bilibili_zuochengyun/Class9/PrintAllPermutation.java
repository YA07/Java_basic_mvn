package leetcode_bilibili_zuochengyun.Class9;

import java.util.ArrayList;

public class PrintAllPermutation {
    public static ArrayList<String> Permutation(String str){
        ArrayList<String> res = new ArrayList<>();
        if(str==null || str.length()==0){
            return res;
        }
        char[] chs = str.toCharArray();
        process(chs,0,res);
        return res;
    }

    public static void process(char[] str,int i,ArrayList<String> res){
        if(i==str.length){
            res.add(String.valueOf(str));
        }
        //str[i...]范围上所有字符，都可以在i位置上
        //[0-(i-1)]上的是确定的，想象成递归的深谷
        boolean visit[] = new boolean[26];
        for(int j=i;j<str.length;j++){
            if(visit[str[j]-'a']==false){
                visit[str[j]-'a'] = true;
                swap(str,i,j);
                process(str,i+1,res);
                swap(str,i,j);
            }
        }
    }
    public static void swap(char ch[],int i,int j){
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }

    public static void main(String[] args) {
        ArrayList<String> res = Permutation("abbc");
        System.out.println(res);
        System.out.println(res.size());
    }
}
