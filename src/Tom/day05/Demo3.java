package Tom.day05;

/**
 * @author 16495
 */
public class Demo3 {
    public static void main(String[] args) {
        youngPeople young = new youngPeople("小李", 8);
        People old = new oldPeople("老李", 66);
        young.eat();
        young.run();
        old.eat();
        //old.set(); People中没有set()


    }

}

class People {
    private String name;
    private int age;

    People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void eat() {
        System.out.println("吃东西~~");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class youngPeople extends People {
    youngPeople(String name, int age) {
        super(name, age);//表示name,age赋值给People中对应的变量
    }

    void run() {
        System.out.println("kid running~~");
    }

    void eat() {
        System.out.println("小孩在吃玉米~~");
    }
}

class oldPeople extends People {
    oldPeople(String name, int age) {
        super(name, age);
    }

    void set() {
        System.out.println("坐下休息");
    }

    @Override
    void eat() {
        System.out.println("老人在喝粥~~~");
    }
}

