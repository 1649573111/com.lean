package Tom.day05;

/**
 * 继承
 * 重写
 *
 * @author 16495
 */
public class Demo1 {
    public static void main(String[] args) {
        Pet cat = new Cat();
        cat.kind = "蓝猫";
        cat.color = "黑色";
        cat.eat();
        cat.play();
        //cat.scratch(); Pet中无此方法  需要Cat cat = new Cat();才可使用


        Dog dog = new Dog();
        dog.kind = "拉布拉多";
        dog.color = "白色";
        dog.eat();
        dog.play();
        dog.bark();
    }

}

class Pet {
    String kind;
    String color;

    void eat() {
        System.out.println(this.kind + "开始干饭~~");
    }

    void play() {
        System.out.println(this.color + "的" + this.kind + "开始玩耍~~");
    }
}

class Cat extends Pet {
    @Override
    void eat() {
        System.out.println(this.kind + "猫开始干饭~~");
    }

    void scratch() {
        System.out.println("和猫猫大王抢饭吃,给你一爪~~");
    }
}

class Dog extends Pet {
    @Override
    void eat() {
        System.out.println(this.color + "的" + this.kind + "开始吃狗粮~~");
    }

    void bark() {
        System.out.println("十二点了,开始狗叫~~");
    }
}





