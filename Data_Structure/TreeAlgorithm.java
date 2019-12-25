public class TreeAlgorithm {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node parent;
        Node(int val){
            this.val = val;
        }
    }


    //给出一个节点，找到该节点后续节点
    public static Node getSuccessorNode(Node head){
        if(head==null){
            return null;
        }
        if(head.right!=null){
            head = head.right;
            while(head.left!=null){
                head = head.left;
            }
            return head;
        }else {
            Node parent = head.parent;
            while(parent!=null){
                if(parent.left==head){
                    return parent;
                }
                head = parent;
                parent = head.parent;
            }
        }
        return null;
    }
}
