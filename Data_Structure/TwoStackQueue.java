import java.util.Stack;

public class TwoStackQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    TwoStackQueue(){
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }


    public void add(int num){
        stack1.push(num);
    }


    public Integer peek(){
        if(stack2.empty()&&stack1.empty()){
            throw new ArrayIndexOutOfBoundsException();
        }
        if(!stack2.isEmpty()){
            return stack2.peek();
        }
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        return stack2.peek();
    }

    public Integer poll(){
        if(stack2.empty()&&stack1.empty()){
            throw new ArrayIndexOutOfBoundsException();
        }
        if(!stack2.isEmpty()){
            return stack2.pop();
        }
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }


}
