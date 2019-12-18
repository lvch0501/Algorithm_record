import java.util.Arrays;

public class ArrayQueue {
    private int[] arr;
    private int end;
    private int start;
    private int size;

    ArrayQueue(int size){
        if(size<0){
            throw new IllegalArgumentException("init size is illegal");
        }
        arr = new int[size];
        end = 0;
        start = 0;
        this.size = 0;
    }


    public void push(int num){
        if(size==arr.length){
            throw new ArrayIndexOutOfBoundsException();
        }
        arr[end] = num;
        end = end==arr.length-1 ? 0 : end+1;
        size++;
    }


    public Integer peak(){
        if(size == 0){
            return null;
        }
        return arr[start];
    }


    public Integer poll(){
        if(size == 0){
            throw new ArrayIndexOutOfBoundsException();
        }
        size--;
        int temp = start;
        start = start==arr.length-1?0:start+1;
        return arr[temp];

    }

    public String toString(){
        return Arrays.toString(arr);
    }
}

class arrayQueueTest{

    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(5);
        arrayQueue.push(1);
        System.out.println(arrayQueue);
        arrayQueue.push(2);
        System.out.println(arrayQueue);
        arrayQueue.push(3);
        System.out.println(arrayQueue);
        arrayQueue.poll();
        System.out.println(arrayQueue);
        arrayQueue.push(4);
        System.out.println(arrayQueue);
        arrayQueue.push(5);
        System.out.println(arrayQueue);
        arrayQueue.push(6);
        System.out.println(arrayQueue);
        arrayQueue.push(3);
        System.out.println(arrayQueue);
    }
}