package Sort_1;

public class Quick {
    public static void main(String[] args) {
        int a[] = {-9,78,0,23,-567,70};

    }

    public static void sort(int a[],int left,int right){
        int l = left;
        int r = right;
        int pivot = a[(left+right)/2];
        int temp = 0;
        while (l<r){
            while (a[l]<pivot){
                l++;
            }
            while (a[r]>pivot){
                r--;
            }

            if(l>=r){
                break;
            }

            temp = a[l];
            a[l] = a[r];
            a[r] = temp;

            if(a[l] == pivot){
                r--;
            }

            if(a[r] == pivot){
                l++;
            }

            if(l==r){
                l++;
                r--;
            }

            if(left<r){

            }

        }
    }
}
