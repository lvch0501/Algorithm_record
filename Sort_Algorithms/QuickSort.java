import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] a = {2,3,4,5,1,9,2,7,4};
        quickSort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }

    public static void quickSort(int[] arr, int left, int right){
        if(left<right){
            swap(arr, left+(int)(Math.random()*(right-left)), right);

            int[] par = partition(arr, left, right);
            System.out.println(Arrays.toString(par));
            quickSort(arr, left, par[0]-1);
            quickSort(arr, par[1]+1, right);
        }
    }

    public static int[] partition(int[] arr, int left, int right){
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
        int[] res = new int[2];
        res[0] = less+1;
        res[1] = right;
        return res;
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
