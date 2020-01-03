import java.util.Arrays;

public class BestArrange {
    public static void main(String[] args) {


    }


    private static class Program{
        public int start;
        public int end;
        Program(int start, int end){
            this.start = start;
            this.end = end;
        }
    }


    public static int bestArrange(Program[] programs, int start){
        Arrays.sort(programs, (Program p1, Program p2)->{return p1.end-p2.end;});

        int result = 0;
        for(int i=0; i<programs.length; i++){
            if(programs[i].start>=start){
                result++;
                start = programs[i].end;
            }
        }
        return result;
    }

}
