public class CountTreeNodeNum {

    public static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
        }
    }

    public static int nodeNum(Node head){
        if(head==null){
            return 0;
        }
        return bs(head, 1, getMostLeftLevel(head, 1));
    }

    public static int bs(Node head, int level, int h){
        if(level==h){
            return 1;
        }

        if(getMostLeftLevel(head.right, level+1)==h){
            return (1<<(h-level))+bs(head.right, level+1, h);
        }else {
            return (1<<(h-level-1))+ bs(head.left, level+1, h);
        }


    }

    public static int getMostLeftLevel(Node head, int level){
        while(head!=null){
            level++;
            head = head.left;
        }
        return level-1;
    }



}
