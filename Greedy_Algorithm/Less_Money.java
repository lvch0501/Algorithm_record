import java.util.Comparator;
import java.util.PriorityQueue;

public class Less_Money {
    //给定固定长度的金条，由K个人分，每次切割金条都会消耗等同于当前切割金条的铜币，求符合分割的最小铜币消耗
    //输入为一个数组，每个元素为每个人金条的长度

    public static void main(String[] args) {
        int[] arr = {20, 10, 40, 30, 50};
        System.out.println(lessMoney(arr));
    }

    public static int lessMoney(int[] arr){
        PriorityQueue<Integer> pQ = new PriorityQueue<>();
        for(int i=0 ;i<arr.length; i++){
            pQ.add(arr[i]);
        }
        int sum = 0;
        int cur = 0;
        while(pQ.size()>1){
            cur = pQ.poll()+pQ.poll();
            sum += cur;
            pQ.add(cur);
        }
        return sum;
    }


}
