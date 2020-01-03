public class PrintAllSub {
    public static void main(String[] args) {

    }



    public static void printSub(char[] chs, int n, String s){
        if(n==chs.length){
            System.out.println(s);
            return;
        }
        printSub(chs, n+1, s);
        printSub(chs, n+1, s+String.valueOf(chs[n]));
    }
}
