package newcoder_leetcode;

import java.util.ArrayList;

/**
 * @Author 17
 * @Description TODO
 * @date 2022/8/5 13:29
 * @Version 1.0
 */
public class Solution7 {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        //ArrayList<Integer> res = new ArrayList();
        ArrayList<ArrayList<Integer>> allres = new ArrayList();
        int cur = 0;
        int i = 1;
        int j = num.length - 1;

        if(num.length<3){
            return allres;
        }

        int k=0;
        while(k<num.length){
            if(num[k]==0)
                k++;
            else{
                break;
            }

        }
        if(k==num.length){
            ArrayList<Integer> res = new ArrayList();
            res.add(0);
            res.add(0);
            res.add(0);
            allres.add(res);
            return allres;

        }

        while (cur < num.length - 2 && i<num.length-1) {
            if (i < j ) {
                if (-num[cur] == num[i] + num[j]) {
                    ArrayList<Integer> res = new ArrayList();
                    res.add(num[cur]);
                    res.add(num[i]);
                    res.add(num[j]);
                    allres.add(res);
                }
                j--;
            }else{
                i++;
                j = num.length-1;
            }
            if(i==num.length-1)
                cur++;
        }

        return allres;

    }


    public static void main(String[] args) {
        Solution7 s = new Solution7();
        int num[] = {0,0,0,0};
        ArrayList<ArrayList<Integer>> allres = s.threeSum(num);
        System.out.println(allres);
    }
}
