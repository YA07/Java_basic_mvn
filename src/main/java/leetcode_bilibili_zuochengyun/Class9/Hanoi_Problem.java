package leetcode_bilibili_zuochengyun.Class9;

public class Hanoi_Problem {
    public static void hanoi(int n){
        if(n>0){
            process(n,"左","中","右");
        }
    }

    public static void process(int i,String start,String end,String other){
        if(i==1){
            System.out.println("move 1 from "+start+" to "+end);
        }else{
            process(i-1,start,other,end);
            System.out.println("move "+i+" from "+start+" to "+end);
            process(i-1,other,end,start);
        }
    }

    public static void main(String[] args) {
        hanoi(6);
    }
}
