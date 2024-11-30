import java.util.Scanner;

abstract class Area {
    abstract void showArea();
}

class Circle extends Area {
    private int radius;

    void setRadius(int rad) {
        radius = rad;
    }

 
    void showArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of the Circle: " + area);
    }
}

class Rectangle extends Area {
    private int length;
    private int width;

    void setLengthWidth(int len, int wid) {
        length = len;
        width = wid;
    }

    void showArea() {
        int area = length * width;
        System.out.println("Area of the Rectangle: " + area);
    }
}

public class Q4AreaApplication {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        Circle circle = new Circle();
        System.out.print("Enter radius of the circle: ");
        int radius = scn.nextInt();
        circle.setRadius(radius);
        circle.showArea();

        Rectangle rectangle = new Rectangle();
        System.out.print("Enter length of the rectangle: ");
        int length = scn.nextInt();
        System.out.print("Enter width of the rectangle: ");
        int width = scn.nextInt();
        rectangle.setLengthWidth(length, width);
        rectangle.showArea();

       
    }
}
