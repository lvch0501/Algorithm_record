import java.util.Stack;

public class BinaryTreeTraversal {

    //二叉树的便利算法


    public static void preOrderRecur(Node head){
        if(head==null){
            return;
        }
        System.out.println(head.val+" ");
        preOrderRecur(head.left);
        preOrderRecur(head.right);
    }
    public static void inOrderRecur(Node head){
        if(head==null){
            return;
        }

        inOrderRecur(head.left);
        System.out.println(head.val+" ");
        inOrderRecur(head.right);
    }
    public static void posOrderRecur(Node head){
        if(head==null){
            return;
        }
        posOrderRecur(head.left);
        posOrderRecur(head.right);
        System.out.println(head.val+" ");
    }

    public static void preOrderUnRecur(Node head){
        if(head != null){
            Stack<Node> stack = new Stack<>();
            stack.push(head);
            while(!stack.isEmpty()){
                head = stack.pop();
                System.out.println(head.val+" ");
                if(head.right!=null){
                    stack.push(head.right);
                }
                if(head.left!=null){
                    stack.push(head.left);
                }
            }
        }
    }

    public static void inOrderUnRecur(Node head){
        if(head!=null){
            Stack<Node> stack = new Stack<>();
            while(!stack.isEmpty()||head!=null){
                if(head!=null){
                    stack.push(head);
                    head = head.left;
                }else {
                    head = stack.pop();
                    System.out.println(head.val+" ");
                    head = head.right;
                }
            }
        }
    }

    public static void posOrderUnRecur(Node head){
        if(head!=null){
            Stack<Node> stack1 = new Stack<>();
            Stack<Node> stack2 = new Stack<>();
            stack1.push(head);
            while(!stack1.isEmpty()){
                head = stack1.pop();
                stack2.push(head);
                if(head.left!=null){
                    stack1.push(head.left);
                }
                if(head.right!=null){
                    stack1.push(head.right);
                }
            }
            while(!stack2.isEmpty()){
                System.out.println(stack1.pop().val+" ");
            }
        }
    }

}
class Node{
    public int val;
    public Node left;
    public Node right;
    Node(int val){
        this.val = val;
    }
}