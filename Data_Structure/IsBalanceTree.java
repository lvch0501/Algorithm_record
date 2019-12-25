public class IsBalanceTree {

    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }


    public static class ReturnData{
        public boolean isBalance;
        public int h;

        ReturnData(boolean isBalance, int h){
            this.isBalance = isBalance;
            this.h = h;
        }
    }

    public static ReturnData isBalance(Node head){
        if(head==null){
            return new ReturnData(true, 0);
        }
        ReturnData rd1 = isBalance(head.left);
        ReturnData rd2 = isBalance(head.right);
        if(!rd1.isBalance||!rd2.isBalance||Math.abs(rd1.h-rd2.h)>1){
            return new ReturnData(false, rd1.h> rd2.h?rd1.h+1:rd2.h+1);
        }
        return new ReturnData(true, rd1.h> rd2.h?rd1.h+1:rd2.h+1);
    }
}
