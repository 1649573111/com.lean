package Jerry.day01;

public class demo1 {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
       Dog dog = new Dog();
       dog.eat();
    }

}

class Pet{
    private String color;
    private String kind;
    public String getKind(){
        return kind;
    }
    public void setKind(String kind){
        this.kind = kind;
    }
    public String getColor(){
        return  color;
    }
    public  void setColor(String color){
        this.color = color;
    }
    public void eat(){
        System.out.println("吃东西");
    }
}

class Cat extends Pet{
    public void scratch(){
        System.out.println("这只猫在挠沙发");
    }
    public void eat(){
        System.out.println("这只猫在吃吃吃");
    }

}
class Dog extends Pet{
    public void bark(){
        System.out.println("这只狗在汪汪叫");
    }
    public void eat(){
        System.out.println("这只狗在吃吃吃");
    }
}