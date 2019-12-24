import java.util.Arrays;

public class PrintElementNotInArrayA {
    // 打印无序数组B中不在有序数组A中的元素

    public static void printElement(int[] a, int[] b){
        Arrays.sort(b);

    }

    public static void main(String[] args) {
        int[] a = {1, 3, 4, 6, 9, 11};
        int[] b = {5, 6, 2, 3};
        printElement(a, b);
    }
}
