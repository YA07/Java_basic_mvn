package DP;

public class CoinChange {
    //                   [2,5,7]   27
    public int solution(int A[],int M){
        int f[] = new int[M+1];
        int n = A.length;
        f[0] = 0;
        int i,j;
        //f[1],f[2],f[3]...f[27]
        for(i=1;i<=M;i++){
            f[i] = Integer.MAX_VALUE;
            //f[i]=min{f[i-A[0]]+1....f[i-A[0]]+27}
            for(j=0;j<n;j++){

            }
        }


        return 1;
    }
}
