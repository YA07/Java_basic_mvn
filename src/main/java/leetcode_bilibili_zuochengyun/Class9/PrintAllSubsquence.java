package leetcode_bilibili_zuochengyun.Class9;

public class PrintAllSubsquence {
    public static void print(String str){
        char[] chs = str.toCharArray();
        process(chs,0);
    }

    public static void process(char[] str,int i){
        if(i==str.length){
            System.out.println(String.valueOf(str));
            return;
        }

        process(str,i+1);
        char tmp = str[i];
        str[i] = 0;
        process(str,i+1);
        str[i] = tmp;

    }

    public static void main(String[] args) {
        print("abc");
    }
}
