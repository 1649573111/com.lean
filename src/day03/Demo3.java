package day03;

import java.util.Scanner;

/**
 * 求素数
 *
 * @author 16495
 */
public class Demo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        for (int i = 2; i < len; i++) {
            if (primeNumber(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean primeNumber(int num) {
        boolean flag = true;
        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
