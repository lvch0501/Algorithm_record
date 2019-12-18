import java.util.Arrays;

public class ArrayStack {
    int[] arr;
    int index;

    ArrayStack(int size){
        arr = new int[size];
        index = 0;
    }

    public void push(int num){
        if(index>=arr.length){
            throw new ArrayIndexOutOfBoundsException();
        }
        arr[index] = num;
        index++;
    }


    public int peak(){
        if(index==0){
            throw new ArrayIndexOutOfBoundsException();
        }
        return arr[index-1];
    }

    public int pop(){
        if(index==0){
            throw new ArrayIndexOutOfBoundsException();
        }
        return arr[--index];
    }

    public String toString(){
        return Arrays.toString(arr);
    }

}

class test{
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(4);
        arrayStack.push(1);
        System.out.println(arrayStack);
        arrayStack.push(2);
        System.out.println(arrayStack);
        arrayStack.pop();
        System.out.println(arrayStack);
        arrayStack.push(3);
        System.out.println(arrayStack);
    }
}