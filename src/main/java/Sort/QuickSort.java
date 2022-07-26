package Sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int a[] = {6,0,-1,9,0};
        sort(a,0,a.length-1); 
        System.out.println(Arrays.toString(a));
    }

    public  static void sort(int a[],int left,int right){
        int l = left;
        int r = right;
        int pivot = a[(left+right)/2];

        int temp = 0;
        while(l<r){
            while(a[l]<pivot){
                l++;
            }
            while (a[r]>pivot){
                r--;
            }
            if(l>=r){//左边全部小于pivot,右边全部大于pivot
                break;
            }

            //交换
            temp = a[l];
            a[l] = a[r];
            a[r] = temp;

            //交换完发现a[l]==pivot，同下
            if(a[l]==pivot){
                r--;
            }
          //a[r]==pivot，说明p的右边没有大于p的了，没必要在继续比较，直接r往左边跑，去等于l，寻求打破循环
            if(a[r]==pivot){
                l++;
            }


        }
        //如果l==r，必须l++，r--，出现栈溢出
        if(r==l){
            l++;
            r--;
        }
        //向左递归
        if(left<r){
            sort(a,left,r);
        }
        //向右递归
        if(right>l){
            sort(a,l,right);
        }
    }

}
