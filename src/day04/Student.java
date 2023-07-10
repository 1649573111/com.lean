package day04;

/**
 * 定义了一个Student类
 *
 * @author 16495
 */
public class Student {
    String name;
    int age;

    Student() {

    }

    Student(String name, int age) {
        //成员变量 = 局部变量;
        this.name = name;
        this.age = age;
    }

    void study() {
        System.out.println(name + ",正在学习");
    }

    void info() {
        System.out.println(name + ": " + age + "岁");
    }
}

