package Tom.day05.test;

public class t3_11 {
    public static void main(String[] args) {
        int money = 100;
        int num = 0;
        for (int i = 0; i < 33; i++) {
            for (int j = 0; j < 50; j++) {
                for (int k = 0; k < 100; k += 3) {
                    if (i + j + k == 100 && i * 3 + j * 2 + k / 3 == 100) {
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }
    }
}
