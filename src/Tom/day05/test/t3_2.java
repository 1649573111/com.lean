package Tom.day05.test;

import java.util.Scanner;

public class t3_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[3];
        int max = 0;
        for (int i = 0; i < 3; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("max:" + max);
    }

}
