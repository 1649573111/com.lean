package day04;

/**
 * @author 16495
 */
public class Demo1 {

    public static void main(String[] args) {

        Student stu1 = new Student();
        stu1.name = "ni";
        stu1.age = 25;
        stu1.info();
        stu1.study();

        Student stu2 = new Student("张三", 25);
        stu2.info();
        stu2.study();


    }

}
