import java.util.Arrays;

public class InsertSort {

    public static void main(String[] args) {
        int[] a = {4,1,2,3,6,1,3,3,4,56,6,1,5,1,21,3};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] arr){
        if(arr.length==0||arr.length==1)return;

        for(int i=1; i<arr.length; i++){
            for(int j=i-1; j>=0; j--){
                if(arr[j]>arr[j+1]){
                    swap(arr, j, j+1);
                }else {
                    break;
                }
            }
        }


    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
