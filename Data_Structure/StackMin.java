import java.util.Stack;

public class StackMin {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    StackMin(){
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int num){
        if(this.stack2.isEmpty()){
            stack2.push(num);
        }else if(this.stack2.peek()>=num){
            stack2.push(num);
        }else {
            stack2.push(stack2.peek());
        }
        stack1.push(num);
    }

    public Integer peek(){
        if(stack1.isEmpty()){
            return null;
        }
        return stack1.peek();
    }

    public Integer getMin(){
        if(stack2.isEmpty()){
            return null;
        }
        return stack2.peek();
    }

    public Integer pop(){
        if(stack1.isEmpty()){
            throw new ArrayIndexOutOfBoundsException();
        }
        stack2.pop();
        return stack1.pop();
    }

}
