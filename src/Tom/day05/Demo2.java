package Tom.day05;

/**
 * @author 16495
 */
public class Demo2 {
    Student pupil = new Pupil("王英", "男", 25, "001");

    public Student getPupil() {
        return pupil;
    }
}

class Student {
    private String name;
    private String gender;
    private int age;
    private String no;

    Student(String name, String gender, int age, String no) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.no = no;
    }

    public void study() {
        System.out.println("开始学习~~");
    }

    public void relax() {
        System.out.println("开始休息~~");
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Pupil extends Student {

    Pupil(String name, String gender, int age, String no) {
        super(name, gender, age, no);
    }
}

class Junior extends Student {
    Junior(String name, String gender, int age, String no) {
        super(name, gender, age, no);
    }

    void night() {
        System.out.println("上晚自习~~");
    }
}

class High extends Student {
    High(String name, String gender, int age, String no) {
        super(name, gender, age, no);
    }

    void light() {
        System.out.println("早晚自习~~~");
    }
}
