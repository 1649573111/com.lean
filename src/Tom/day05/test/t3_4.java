package Tom.day05.test;

import java.util.Scanner;

public class t3_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("选择(1:+  2:-  3:*  4:/)");
        int select = scan.nextInt();
        double result = 0.0;
        switch (select) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                result = 1.0 * num1 / num2;
                break;
            default:
                System.out.println("输入有误!");
                return;
        }
        System.out.println("结果等于" + result);


    }
}
