public class isPalindrome {
    //给定一个链表，判断是否为回文链表

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;
        System.out.println(isPalind(node1));
    }

    public static boolean isPalind(ListNode node){
        if(node==null||node.next==null){
            return true;
        }
        ListNode first = node;
        ListNode second = node;
        int count = 0;
        while(second!=null){
            second = second.next;
            count++;
            if(count>0&&count%2==0){
                first = first.next;
            }
        }
        ListNode pre = first;
        ListNode next = first.next;
        pre.next = null;
        while(next!=null){
            ListNode temp = next.next;
            next.next = pre;
            pre = next;
            next = temp;

        }

        while(node!=null&&pre!=null){
            if(node.val!=pre.val){
                return false;
            }
            node = node.next;
            pre = pre.next;
        }
        return true;
    }
}

class ListNode{
    public int val;
    public ListNode next;
    ListNode(int val){
        this.val = val;
    }
}