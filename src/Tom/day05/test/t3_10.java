package Tom.day05.test;

public class t3_10 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 100 + 1; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
