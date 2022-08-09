package leetcode_bilibili_zuochengyun.Class9;

/**
 * @Author 17
 * @Description TODO
 * @date 2022/7/29 10:20
 * @Version 1.0
 */
public class Hanoi_ {
    public static void hanoi(int n){
        if(n>0){
            process(n,"左","中","右");
        }
    }

    public static void process(int i,String start,String end,String other){
        if(i==1){
            System.out.println("move 1 from "+start+" to "+end);
            return;
        }
        process(i-1,start,other,end);
        System.out.println("move "+i+" from "+start+" to "+end);
        process(i-1,other,end,start);

    }

    public static void main(String[] args) {
        hanoi(4);
    }
}
