import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] a = {3, 5, 1, 2, 6, 3, 11, 5};
        quickSort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }



    public static void quickSort(int[] a, int left, int right){
        if(left>=right){
            return;
        }
        int mid = partition(a, left, right);
        quickSort(a, left, mid-1);
        quickSort(a, mid+1, right);
    }

    public static int partition(int[] a, int left, int right){
        int less = left-1;
        int last = right;
        while(left<right){
            if(a[left]<=a[last]){
                swap(a, ++less, left++);
            }else if(a[left]==a[last]){
                left++;
            }else {
                swap(a, left, --right);
            }
        }
        swap(a, last, right);
        return right;
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
