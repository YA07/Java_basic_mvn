package Sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        //int a[] = {49,38,65,97,76,13,27};
        int a[] = {8,4,5,7,1,3,6,2};
        int temp[] = new int[a.length];
        mergeSort(a,0,a.length-1,temp);

    }

    public static void  mergeSort(int a[],int left,int right,int temp[]){
        if(left < right){
            int mid = (left+right)/2;
            mergeSort(a,left,mid,temp);
            mergeSort(a,mid+1,right,temp);
            merge(a,left,mid,right,temp);
        }
        System.out.println(Arrays.toString(a));
    }


    public static void merge(int a[],int left,int mid,int right,int temp[]){
        int i =left; //左边有序序列的头
        int j = mid+1;//右边有序序列的头
        int t = 0;//指向temp数组的当前索引

        //先把左右两边有序的数据按照规则填充到temp数组
        //直到左右两边的有序序列，有一方处理完为止
        //把有剩余数据的一边全部填充进temp

        if(i <= mid &&j <= right){
            if(a[i] <= a[j]){
                temp[t] = a[i];
                t++;
                i++;
            }else{
                temp[t] = a[j];
                t++;
                j++;
            }
        }

        while(i <= mid){
            temp[t] = a[i];
            t++;
            i++;
        }
        while(j <= right){
            temp[t] = a[j];
            t++;
            j++;
        }
        //将temp[]拷贝进a[]
        //注意，并不是每次拷贝所有
        t=0;
        int tempLeft = left;
        System.out.println("tempLeft= "+tempLeft+"right= "+right);
        while(tempLeft <= right){
            a[tempLeft] = temp[t];
            t++;
            tempLeft++;
        }

    }
}
