package Jerry.test1;

public class pro11 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= 100; j++) {
                for (int k = 0; k <= 100; k += 3) {
                    if ((i + j + k == 100) && (i * 3 + 2 * j + k / 3 == 100)) {
                        System.out.println(i + " " + j + " " + k + " ");
                    }
                }
            }
        }
    }
}
