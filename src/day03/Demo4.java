package day03;

import java.util.Scanner;

/**
 * @author 16495
 */
public class Demo4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("输入月份:");
        int month = scan.nextInt();
        System.out.println("输入价格:");
        double price = scan.nextDouble();
        System.out.println("选择仓位:1.头等舱 2.商务舱 3.经济舱");
        int type = scan.nextInt();
        System.out.println("折后价位为:" + calFinalPrice(month, price, type));

    }

    public static double calFinalPrice(int month, double price, int type) {
        double re;
        if (month <= 10 && month >= 5) {
            switch (type) {
                case 1:
                    re = price * 0.9;
                    break;
                case 2:
                    re = price * 0.85;
                    break;
                case 3:
                    re = price * 0.8;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + type);
            }
        } else {
            switch (type) {
                case 1:
                    re = price * 7;
                    break;
                case 2:
                    re = price * 0.65;
                    break;
                case 3:
                    re = price * 0.6;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + type);

            }
        }

        return re;
    }
}



