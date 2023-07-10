package day03;

/**
 * 去掉最高和最低,求平均数
 *
 * @author 16495
 */
public class Demo5 {
    public static void main(String[] args) {
        int[] array = {10, 52, 20, 23, 92};
        System.out.println(avg(array));
    }

    public static double avg(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
        for (int j : arr) {
            if (j != max && j != min) {
                sum += j;
            }
        }
        System.out.println(sum);
        return (sum / (arr.length - 2));
    }

}
