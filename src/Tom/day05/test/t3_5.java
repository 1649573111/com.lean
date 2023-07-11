package Tom.day05.test;

import java.util.Scanner;

public class t3_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int weight = scan.nextInt();
        double price = 5.0;
        if (weight <= 100 && weight > 20) price += (weight - 20) * 0.2;
        if (weight > 100) price = 5 + 16 + (weight - 100) * 0.15;
        System.out.println(price);
    }
}
