package Tom.day01;


/**
 * @author 16495
 */
public class Main {
    public static void main(String[] args) {
        /*
         * 九九乘法表
         */
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print((j + 1) + "*" + (i + 1) + "=" + ((i + 1) * (j + 1)) + " ");
            }
            System.out.println();
        }
    }
}