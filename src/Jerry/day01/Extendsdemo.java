package Jerry.day01;

/**
 * @author 彭
 */
public class Extendsdemo {
    public static void main(String[] args) {
        Square s = new Square(4.5);
        double area = s.getArea();
        System.out.println(area);
        double girth = s.getGirth();
        System.out.println(girth);


    }
}

class Rectangle{
    private double width;
    private double height;

    Rectangle(double width, double height){
        this.setWidth(width);
        this.setHeight(height);
    }
    public double getWidth(){
        return width;
    }

    private void setWidth(double width) {
        if(width<=0) {
            return;
        }
        this.width = width;
    }
    public double getHeight(){
        return height;
    }

    private void setHeight(double height) {
        if(height<=0) {
            return;
        }
        this.height = height;
    }

    public  double getGirth(){
        return (width+height)*2;
    }
    public double getArea(){
        return width*height;
    }

}

class Square extends Rectangle{
    Square(double width){
       super(width,width);
    }
}

