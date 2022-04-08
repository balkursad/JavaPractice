package day35_OOPEncapsulation;

public class Rectangle {

    private double width;
    private double length;

    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }

    public void setLength(double length){
        if (length<0){
            return;
        }
        this.length = length;
    }
    public void setWidth(double width){
        if (width<0){
            return;
        }
        this.width= width;
    }

    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    public double calcArea(){
        double area= width*length;
        return area;
    }

    public double calcPerimeter(){
        double perimeter = 2*(width+length);
        return perimeter;
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
