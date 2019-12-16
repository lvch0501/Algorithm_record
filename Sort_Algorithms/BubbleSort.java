import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] a = {2, 1, 3, 4, 6 ,12};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] arr){
        if(arr.length==0||arr.length==1)return;
        boolean flag = false;
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    swap(arr, j, j+1);
                    flag=true;
                }
            }
            if(!flag){
                return;
            }
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
