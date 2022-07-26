package leetcode_bilibili_zuochengyun.class1;

/**
 * @Author 17
 * @Description TODO 异或运算
 * @date 2022/7/8 10:22
 * @Version 1.0
 */
public class Demo1 {
    //找出数组中唯一一个出现奇数次得数
    public static int fun1(int a[]){
        int temp = 0;
        for(int i=0;i<a.length;i++){
            temp = temp ^ a[i];
        }
        return temp;
    }

    //两个数出现奇数次，其余都是偶数次
    public static void fun2(int a[]){
        int temp = 0;
        for(int i=0;i<a.length;i++){
            temp = temp ^ a[i];
        }
        //temp = a^b(两个仅剩的奇数)
        //temp!=0
        //temp必有一个位置是1
        int rightOne = temp & (~temp+1);//取出最右侧的1
        int onlyOne = 0;
        for(int i=0;i<a.length;i++){
            if((a[i]&rightOne)==1){
                onlyOne = a[i]^onlyOne;
            }
        }
        System.out.println(onlyOne+"   "+(onlyOne^temp));

    }

    public static void main(String[] args) {
        int a[] = {2,1,3,1,3,1,2,1,3,2};

        Demo1.fun2(a);
    }
}
