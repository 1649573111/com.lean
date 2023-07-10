package day03;

import java.util.Random;

/**
 * N位验证码
 *
 * @author 16495
 */

public class Demo2 {
    public static void main(String[] args) {
        String code = verificationCode(4);
        System.out.println(code);
    }

    public static String verificationCode(int len) {
        String code = "";
        Random rand = new Random();
        for (int i = 0; i < len; i++) {
            int num1 = rand.nextInt(3);
            if (num1 == 0) {
                code += (char) (rand.nextInt(26) + 65);
            } else if (num1 == 1) {
                code += (char) (rand.nextInt(26) + 97);
            } else {
                code += rand.nextInt(10);
            }
        }

        return code;
    }
}
