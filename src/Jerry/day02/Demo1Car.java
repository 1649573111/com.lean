package Jerry.day02;

/**
 * @author 彭
 */
public class Demo1Car {
    String brand;
    String color;
    int price;

    Demo1Car(){
    }

    Demo1Car(String brand, String color, int price){
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    void start(){
        System.out.println("彭欣悦"+price+"万的"+color+brand+",启动了");
    }


    void run (){
        System.out.println("彭欣悦"+price+"万的"+color+brand+",起飞了");
    }

    void stop(){
        System.out.println("彭欣悦"+price+"万的"+color+brand+",停止了");
    }



}
