import java.util.Arrays;

public class PartitionSort {

    public static void main(String[] args) {
        int[] a = {2,3,4,5,1,9,2,7,4};
        paritition(a,0, a.length-1);
        System.out.println(Arrays.toString(a));
    }
    public static void paritition(int[] arr, int left, int right){
        int less = left-1;
        int last = right;
        while(left<right){
            if(arr[left]>arr[last]){
                swap(arr, left, --right);
            }else if(arr[left]<arr[last]){
                swap(arr, ++less, left++);
            }else {
                left++;
            }
        }
        swap(arr, last, right);
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
