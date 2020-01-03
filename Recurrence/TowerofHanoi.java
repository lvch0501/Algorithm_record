public class TowerofHanoi {


    public static void main(String[] args) {
        process(3, "left", "right", "mid");
    }
    public static void process(int N, String from, String to, String help){
        if(N==1){
            System.out.println("move 1 from "+ from+" to "+to);
        }else {
            process(N-1, from, help, to);
            process(1, from, to, help);
            process(N-1, help, to, from);
        }

    }

}
