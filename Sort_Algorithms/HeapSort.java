import java.util.Arrays;

public class HeapSort {


    public static void main(String[] args) {
        int[] a = {2,3,4,5,1,9,2,7,4};
        heapSort(a);
        //System.out.println(Arrays.toString(a));
    }

    public static void heapSort(int[] arr){
        if(arr.length==0||arr.length==1){
            return;
        }

        for(int i=1; i<arr.length; i++){
            heapInsert(arr, i);
        }

        int heapSize = arr.length-1;

        swap(arr, 0, heapSize--);

        while(heapSize>0){
            heapify(arr, heapSize);
            System.out.println(Arrays.toString(arr));
            swap(arr,  0, heapSize--);
        }




    }
    public static void heapInsert(int[] arr, int i){
        while(i>0){
            if(arr[i]>arr[(i-1)/2]){
                swap(arr, i, (i-1)/2);
            }
            i= (i-1)/2;
        }
    }

    public static void heapify(int[] arr, int index){
        int left = 1;
        System.out.println(index);
        while(left <= index){
            int largest = left+1<=index&&arr[left+1]<arr[left]?left:left+1;
            largest = arr[largest]>arr[(left-1)/2]?largest:(left-1)/2;
            if(largest==(left-1)/2){
                break;
            }
            swap(arr, largest, (left-1)/2);
            left=largest*2+1;
        }
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
