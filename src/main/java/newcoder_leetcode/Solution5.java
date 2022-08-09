package newcoder_leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author 17
 * @Description TODO
 * @date 2022/7/29 11:59
 * @Version 1.0
 */
public class Solution5 {
    ArrayList<ArrayList<Integer>> allRes = new ArrayList();
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        //Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        if(num.length==0)
            return allRes;
        process(0,num);
        return allRes;
    }

    public void process(int i,int[] num){
        ArrayList<Integer> res = new ArrayList();
        if(i==num.length){
            for(int k=0;k<num.length;k++){
                res.add(num[k]);
            }
            allRes.add(res);
        }
        boolean visit[] = new boolean[7];
        for(int j=i;j<num.length;j++){
            if(visit[num[j]+1]==false){
                visit[num[j]+1] = true;
                swap(i,j,num);
                process(i+1,num);
                swap(i,j,num);
            }
        }

    }

    public void swap(int i,int j,int[] num){
        int t = num[i];
        num[i] = num[j];
        num[j] = t;
    }

    public static void main(String[] args) {
        int[] n = {2,0,3};
        Solution5 s = new Solution5();
        List<ArrayList<Integer>> allRes = s.permute(n);
        //Collections.sort(allRes);
        System.out.println(allRes);
    }
}
