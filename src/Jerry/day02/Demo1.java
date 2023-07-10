package Jerry.day02;

/**
 * @author 彭
 */
public class Demo1 {
    public static void main(String[] args) {
        Demo1Car  car1 = new Demo1Car();
        car1.price = 80;
        car1.color = "黑色";
        car1.brand = "奔驰";
        car1.start();
        car1.run();
        car1.stop();

        Demo1Car  car2 = new Demo1Car("五菱宏光mini","白色",20);
        car2.start();
        car2.run();
        car2.stop();

    }
}
