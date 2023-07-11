package Tom.day05;

/**
 * 计算周长和面积
 */
public class Demo4 {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(3, 5);
        System.out.println("长方形的周长:" + rectangle.getArea());
        System.out.println("长方形的面积:" + rectangle.getGirth());

        Shape circle = new Circle(4);
        System.out.println("圆的周长:" + circle.getArea());
        System.out.println("圆的面积:" + circle.getGirth());
    }
}

class Shape {

    public double getGirth() {
        return 0.0;
    }

    public double getArea() {
        return 0.0;
    }
}

class Rectangle extends Shape {
    double wight;
    double height;

    Rectangle(double wight, double height) {
        this.wight = wight;
        this.height = height;
    }

    public double getGirth() {
        return (wight + height) * 2;
    }

    @Override
    public double getArea() {
        return wight * height;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getGirth() {
        return radius * Math.PI * 2;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
