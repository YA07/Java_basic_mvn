package newcoder_leetcode;

import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.io.BufferedReader;
import java.util.Arrays;

/**
 * @Coder 17
 * @ClassName Solution3
 * @Description TODO 数据流中的中位数
 * @date 2022/6/12 19:13
 * @Version 1.0
 */
//堆排序，效仿的王道考研
public class Solution3 {
    public void BuildMaxHeap(int A[],int len){
        for(int i=len/3;i>0;i--){
            HeadAdjust(A,i,len);
            System.out.print("每一次调整后的数组  ");
            System.out.println( Arrays.toString(A));
        }
    }

    public void HeadAdjust(int A[],int k,int len){
        int temp = A[k];
        for(int i=2*k+1;i<=len;i++){
            if(i<len && A[i]<A[i+1]){
                i++;
            }
            if(A[k]>=A[i])
                break;
            else{
                A[k] = A[i];
                k = i;
            }
        }
        A[k] = A[0];
    }

    public void HeapSort(int A[],int len){
        BuildMaxHeap(A,len);
        for(int i=len-1;i>0;i--){
            //swap(A[i],A[1]);
            int temp = A[i];
            A[i] = A[1];
            A[1] = temp;

            HeadAdjust(A,1,i-1);
        }
    }


    public static void main(String[] args) {
        Solution3 s = new Solution3();
        int A[] = {87,45,78,32,17,65,53,9};
        s.HeapSort(A,A.length);

    }
}
