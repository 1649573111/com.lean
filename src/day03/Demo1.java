package day03;


import java.util.Random;
import java.util.Scanner;

/**
 * 猜数字
 *
 * @author 16495
 */
public class Demo1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int num = rand.nextInt(100);
        int count = 0;
        while (true) {
            int guess = scan.nextInt();
            count++;
            if (guess == num) {

                System.out.println("对了");

                break;
            } else if (guess < num) {

                System.out.println("小了");
            } else {

                System.out.println("大了");
            }
        }
        System.out.println("次数:" + count);

    }


}
