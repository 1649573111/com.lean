package Tom.day05.test;

import java.util.Scanner;

public class t3_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 1;
        for (int i = 1; i < num + 1; i++) {
            sum *= i;
        }
        System.out.println(sum);
    }
}