package day02;

/**
 * @author 16495
 */
public class Demo4 {
    public static void main(String[] args) {
        output(sort(arr()));

    }

    public static int[] arr() {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        return a;
    }

    public static void output(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr().length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr().length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

}
