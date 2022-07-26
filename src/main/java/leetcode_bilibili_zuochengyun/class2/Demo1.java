package leetcode_bilibili_zuochengyun.class2;

/**
 * @Author 17
 * @Description TODO
 * @date 2022/7/9 10:19
 * @Version 1.0
 */
public class Demo1 {
    //递归获取最大值
    public static int process(int a[],int L,int R){
        if(L==R){
            return a[L];
        }
        int mid = L + ((R-L)>>1);
        int leftmax = process(a,L,mid);
        int rightmax = process(a,mid+1,R);
        return Math.max(leftmax,rightmax);
    }

    public static int getmax(int a[]){
        return process(a,0,a.length-1);
    }

    public static void main(String[] args) {
        int a[] = {1,3,1,5,1,2,5,0,7,6,1};
        System.out.println(Demo1.getmax(a));
    }
}
