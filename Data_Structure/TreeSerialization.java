import sun.plugin.javascript.navig4.Link;

import java.util.LinkedList;
import java.util.Queue;

public class TreeSerialization {


    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node4.left = null;
        node4.right = null;
        node5.left = null;
        node5.right = null;
        node3.left = null;
        node3.right = null;
        System.out.println(serialPre(node1));
    }
    //序列化与反序列化一棵树
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    //根据先序遍历序列化一棵树
    public static String serialPre(Node head){
        if(head==null){
            return "#_";
        }
        String s = head.val+"_";
        s += serialPre(head.left);
        s += serialPre(head.right);
        return s;
    }

    //根据先序遍历反序列化一棵树
    public static Node unserialPre(String s){
        Queue<String> queue = new LinkedList<>();
        String[] sArr = s.split("_");
        for(String item:sArr){
            queue.offer(item);
        }
    }

    public static Node reconPreOrder(Queue<String> queue){
        String value = queue.poll();
        if(value.equals("#")){
            return null;
        }

        Node head = new Node(Integer.valueOf(value));
        head.left = reconPreOrder(queue);
        head.right = reconPreOrder(queue);
        return head;
    }



}
