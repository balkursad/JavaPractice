package day33_CustomClassStatics;

public class Car {

    public String make;
    public String model;
    public String color;
    public int year;
    public double price;

    public static int numberOfWheels;
    public static boolean hasBattery;
    public static boolean hasSeats;

    public Car(String make, String model, String color, int year, double price) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    public void drive(){
        System.out.println(make+ " "+ model+ " is drove.");
    }

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
