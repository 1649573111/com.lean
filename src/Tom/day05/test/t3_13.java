package Tom.day05.test;

public class t3_13 {
    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i++) {
            int num1 = i / 100;
            int num2 = i % 100;
            if ((num1 + num2) * (num1 + num2) == i) {
                System.out.println(num1 + " " + num2);
                System.out.println(i);
            }
        }
    }
}
