import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] a = {3, 5, 1, 2, 6, 3, 11, 5};
        HeapSort(a);
        System.out.println(Arrays.toString(a));
    }



    public static void HeapSort(int[] a){
        if(a.length==0||a.length==1){
            return;
        }
        for(int i=1; i<a.length; i++){
            CreateMaxHeap(a, i);
        }

        int heapSize = a.length-1;
        swap(a, 0, heapSize--);

        while(heapSize>0){
            adjustHeap(a, heapSize);
            swap(a, 0, heapSize--);
        }


    }

    public static void CreateMaxHeap(int[] arr, int start){
        while(start>0){
            if(arr[start]>arr[(start-1)/2]){
                swap(arr, start, (start-1)/2);
            }
            start = (start-1)/2;
        }
    }

    public static void adjustHeap(int[] arr, int size){
        int start = 1;
        while(start<size){
            int index = start+1<=size&&arr[start+1]>arr[start]?start+1:start;
            int largest = arr[index]>arr[(start-1)/2]?arr[index]:arr[(start-1)/2];
            if(largest==arr[(start-1)/2]){
                return;
            }
            swap(arr, (start-1)/2, index);
            start = index*2+1;
        }
    }
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
