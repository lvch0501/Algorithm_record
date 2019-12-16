import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = {4,1,2,3,6,1,3,3,4,56,6,1,5,1,21,3};
        sort(a,0, a.length-1);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] arr, int left, int right){
        if(left==right)return;

        int mid = left + (right-left)/2;
        sort(arr, left, mid);
        sort(arr,mid+1, right);
        merge(arr, left, right, mid);
    }

    public static void merge(int[] arr, int left, int right, int mid){
        int[] temp = new int[right-left+1];

        int l = left;
        int r = mid+1;
        int count = 0;
        while(l<=mid&&r<=right){
            temp[count++] = arr[l]<arr[r]?arr[l++]:arr[r++];
        }

        while(l<=mid){
            temp[count++] = arr[l++];
        }

        while(r<=right){
            temp[count++] = arr[r++];
        }
        count = 0;
        while(left<=right){
            arr[left++] = temp[count++];
        }
    }

}
