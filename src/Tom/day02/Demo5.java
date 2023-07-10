package Tom.day02;


/**
 * 方法重载
 *
 * @author 16495
 */
public class Demo5 {
    public static void main(String[] args) {
        overload();
        overload("cat");
    }

    public static void overload() {
        System.out.println("hello,tom");
    }

    public static void overload(String name) {
        System.out.println("hello," + name);
    }
}
