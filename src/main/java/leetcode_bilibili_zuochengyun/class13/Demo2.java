package leetcode_bilibili_zuochengyun.class13;

import java.util.List;

/**
 * @Author 17
 * @Description TODO 邀请员工使得排队宴会最大快乐值
 * @date 2022/8/8 13:44
 * @Version 1.0
 */
public class Demo2 {
    public static class Employee{
        public int happy;
        public List<Employee> nexts;
    }

    public static class Info{
        public int laiMaxHappy;
        public int bulaiMaxHappy;

        public Info(int laiMaxHappy, int bulaiMaxHappy) {
            this.laiMaxHappy = laiMaxHappy;
            this.bulaiMaxHappy = bulaiMaxHappy;
        }
    }

    public static int maxHappy(Employee boss){
        Info headInfo =  process(boss);
        return Math.max(headInfo.laiMaxHappy,headInfo.bulaiMaxHappy);
    }

    public static Info process(Employee e){
        if(e.nexts.isEmpty()){
            return new Info(e.happy,0);
        }
        int lai = e.happy;
        int bulai = 0;

        for(Employee next : e.nexts){
            Info nextInfo = process(next);
            lai += nextInfo.bulaiMaxHappy;
            bulai += Math.max(nextInfo.laiMaxHappy,nextInfo.bulaiMaxHappy);
        }

        return new Info(lai,bulai);
    }
}
