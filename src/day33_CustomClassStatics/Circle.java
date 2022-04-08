package day33_CustomClassStatics;

public class Circle {

    public double radius;
    public double diameter;

    public static double pi;

    static {
        pi=3.14;
    }

    public Circle(double radius, double diameter) {
        this.radius = radius;
    }

    public double calcArea(){
        double area = pi*radius*radius;
        return area;
    }

    public double calcPerimeter(){
        double perimeter = 2*radius*pi;
        return perimeter;
    }

    public static void pi(){
        System.out.println("pi is :"+pi);
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", pi=" + pi +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
