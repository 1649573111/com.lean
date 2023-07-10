package day02;

/**
 * 数组
 *
 * @author 16495
 */
public class Demo1 {
    public static void main(String[] args) {
        int a = 10, b = 5;
        int re1 = add(a, b);
        int re2 = sub(a, b);
        int re3 = mul(a, b);
        int re4 = div(a, b);
        System.out.println(re1);
        System.out.println(re2);
        System.out.println(re3);
        System.out.println(re4);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }
}
