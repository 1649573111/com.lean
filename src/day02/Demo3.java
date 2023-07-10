package day02;

/**
 * @author 16495
 */
public class Demo3 {
    public static void main(String[] args) {
        up(4);
        down(4);
    }

    public static void up(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void down(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
