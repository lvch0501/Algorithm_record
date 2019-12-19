import java.util.LinkedList;
import java.util.Queue;

public class TwoQueueStack {
    Queue<Integer> queue1;
    Queue<Integer> queue2;

    TwoQueueStack(){
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();

    }

    public void add(int num){
        queue1.add(num);
    }

    public Integer peek(){
        if(queue1.isEmpty()){
            throw new ArrayIndexOutOfBoundsException();
        }
        while(queue1.size()!=1){
            queue2.add(queue1.poll());
        }
        int temp = queue1.poll();
        queue2.add(temp);
        swap();
        return temp;

    }

    public Integer push(){
        if(queue1.isEmpty()){
            throw new ArrayIndexOutOfBoundsException();
        }
        while(queue1.size()!=1){
            queue2.add(queue1.poll());
        }
        int temp = queue1.poll();
        swap();
        return temp;
    }
    public void swap(){
        Queue<Integer> temp;
        temp = queue2;
        queue2 = queue1;
        queue1 = temp;
    }

}
