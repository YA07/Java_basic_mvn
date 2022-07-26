package Sort_1;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int a[] = {8,4,5,7,1,3,6,2};
        int temp[] = new int[a.length];
        mergerSort(a,0,a.length-1,temp);

        System.out.println(Arrays.toString(a));

    }

    public static void mergerSort(int a[],int left,int right,int temp[]){
        if(left<right){
            int mid = (left+right)/2;
            mergerSort(a,left,mid,temp);
            mergerSort(a,mid+1,right,temp);
            merger(a,left,mid,right,temp);
        }
    }

    public static void merger(int a[],int left,int mid,int right,int temp[]){
        int i = left;
        int j = mid+1;
        int t = 0;

        while(i<=mid && j<=right){
            if(a[i]<=a[j]){
                temp[t] = a[i];
                t++;
                i++;
            }else{
                temp[t] = a[j];
                t++;
                j++;
            }
        }

        while(i<=mid){
            temp[t] = a[i];
            t++;
            i++;
        }
        while(j<=right){
            temp[t] = a[j];
            t++;
            j++;
        }

        t = 0;
        int tempLeft = left;
        while (tempLeft<=right){
            a[tempLeft] = temp[t];
            t++;
            tempLeft++;
        }
    }
}
