package ACM_Test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author 17
 * @Description TODO
 * @date 2022/7/12 21:03
 * @Version 1.0
 */
public class Multilineinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int full = sc.nextInt();
            int avg = sc.nextInt();
            int[][] nums = new int[n][2];
            for (int i=0;i<n;i++){
                nums[i][0] = sc.nextInt();
                nums[i][1] = sc.nextInt();
            }
            if (n==1){
                System.out.println((avg-nums[0][0])*nums[0][1]);
                continue;
            }

            Arrays.sort(nums,((o1, o2) -> o1[1]-o2[1]));
            
        }
    }
}
