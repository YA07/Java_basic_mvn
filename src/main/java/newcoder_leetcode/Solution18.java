package newcoder_leetcode;

/**
 * @Author 17
 * @Description TODO 322. 零钱兑换
 * @date 2022/8/25 15:09
 * @Version 1.0
 */
public class Solution18 {
    //1 暴力递归
    int res1 = Integer.MAX_VALUE;
    public int coinChange1(int[] coins, int amount){
        if(coins.length==0)
            return -1;

        findWay1(coins,amount,0);

        if(res1 == Integer.MAX_VALUE){
            return -1;
        }

        return res1;
    }

    public void findWay1(int coins[], int amount, int count){
        if(amount<0){
            return;
        }

        if(amount==0){
            res1 = Math.min(res1,count);
        }

        for(int i = 0;i < coins.length;i++){
            findWay1(coins,amount-coins[i],count+1);
        }
    }

    //2 记忆化搜索
    int[] record;
    public int coinChange2(int coins[],int amount){
        if(coins.length==0){
            return  -1;
        }

        record = new int[amount+1];

        return findWay2(coins,amount);
    }

    public int findWay2(int coins[],int amount){
        if(amount<0){
            return -1;
        }
        if(amount==0){
            return 0;
        }

        if(record[amount]!=0){
            return record[amount];
        }

        int min = Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++){
            int res = findWay2(coins,amount-coins[i]);
            if(res>=0 && res<min){
                min = res+1;
            }
        }
        record[amount] = (min == Integer.MAX_VALUE ? -1 : min);
        return record[amount];
    }

    //3 动态规划



    public static void main(String[] args) {
        Solution18 s = new Solution18();
        int coins[] = {5,3,2};
        int amount = 20;
        System.out.println(s.coinChange1(coins,amount));
        System.out.println(s.coinChange2(coins,amount));
    }
}
