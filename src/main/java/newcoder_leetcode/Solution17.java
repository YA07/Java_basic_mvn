package newcoder_leetcode;

/**
 * @Author 17
 * @Description TODO BM69 把数字翻译成字符串
 * @date 2022/8/24 15:42
 * @Version 1.0
 */
public class Solution17 {
    public static int solve(String nums){
        return process1(nums.toCharArray(),0);
    }

    public static int process1(char nums[],int i){
        if(i==nums.length){
            return 1;
        }
        if(nums[i]=='0'){
            return  0;
        }
        int res1 = process1(nums,i+1);
        int res2 = 0;

        if((i<nums.length-1)&&(nums[i]=='1'||(nums[i]=='2')&&nums[i+1]<='6')){
            res2 = process1(nums,i+2);
        }
        return res1+res2;
    }

    public static int process2(char nums[],int i){
        if(i==nums.length-1){
            return 1;
        }
        if(nums[i]=='0'){
            return  0;
        }
        int res1 = process2(nums,i+1);
        int res2 = 0;

        if((i<nums.length-1)&&(nums[i]=='1'||(nums[i]=='2')&&nums[i+1]<='6')){
            res2 = process2(nums,i+2);
        }
        return res1+res2;
    }

    public static void main(String[] args) {
        String nums = "12345121";
        System.out.println(solve(nums));
    }
}
