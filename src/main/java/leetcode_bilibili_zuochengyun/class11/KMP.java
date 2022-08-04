package leetcode_bilibili_zuochengyun.class11;

public class KMP {


    public static int[] getNextArray(char[] chs){
        if(chs.length == 1){
            return new int[]{-1};
        }
        int next[] = new int[chs.length];
        next[0] = -1;
        next[1] = 0;
        int i = 2;
        int cn = 0;
        while (i<next.length){
            if(chs[i-1] == chs[cn]){
                cn = cn+1;
                next[i] = cn;
                i++;
            }else if(cn>0){
                cn = next[cn];
            }else {
                next[i++] = 0;
            }
        }
        return next;
    }

    public static int getIndex(String str1,String str2){
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        int next[] = getNextArray(ch2);
        int i1 = 0;
        int i2 = 0;
        while (i1<ch1.length && i2<ch2.length){
            if(ch1[i1] == ch2[i2]){
                i1++;
                i2++;
            }else if(next[i2]==-1){
                i1++;
            }else{
                i2 = next[i2];
            }
        }
        if(i2==ch2.length){
            return i1-i2;
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        String s1 = "abcdskabcde";
        String s2 = "abcdf";
        System.out.println(getIndex(s1,s2));
    }
}
