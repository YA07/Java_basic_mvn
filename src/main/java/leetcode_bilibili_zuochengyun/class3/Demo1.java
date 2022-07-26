package leetcode_bilibili_zuochengyun.class3;

/**
 * @Author 17
 * @Description TODO 堆排序
 * @date 2022/7/10 10:48
 * @Version 1.0
 */
public class Demo1 {


    //某个数出现在index位置，继续向上移动
    public static void heapInsert(int a[],int index){
        while(a[index]>a[(index-1)/2]){
            swap(a,index,(index-1)/2);
            index = (index-1)/2;
        }
    }

    //某个数在index位置，往下移动（heapify）
    public static void heapify(int a[],int index,int heapsize){
        int left = index*2+1; //左孩子下标
        int right = left+1;

        while (left<heapsize){
            //两个孩子中，谁的值大，把下标给largest
            int largest = right<heapsize && a[right]>a[left] ? right : left;

            //父子对决
            largest = a[index]>a[largest] ? index : largest;
            if(largest == index){
                break;
            }
            swap(a,largest,index);
            index = largest;
            left = index*2+1;
        }
    }

    public static void swap(int a[],int i,int j){
        int temp = 0;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
