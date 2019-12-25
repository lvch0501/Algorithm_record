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