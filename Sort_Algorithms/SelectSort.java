import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] a = {};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int max = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[max])
                    max=j;

            }
            swap(arr, i, max);
        }


    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
