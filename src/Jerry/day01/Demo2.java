package Jerry.day01;

/**
 * @author 彭
 */
public class Demo2 {
    Student stu = new Student();


}

class Student {
    private String name;
    private String gender;
    private int age;
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void pupil(){

    }
    public void junior(){
        System.out.println(name+"要上晚自习");
    }
    public void senior(){
        System.out.println(name+"要上早晚自习");
    }


}
