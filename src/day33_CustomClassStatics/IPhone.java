package day33_CustomClassStatics;

public class IPhone {

    public String model;
    public double price;
    public String color;
    public char size;

    public static String brand;
    public static String OS;
    public static String madeIn;

    static {
        brand = "Apple";
        OS = "IOS";
        madeIn = "China";
    }

    public IPhone(String model, double price, String color, char size) {
        this.model = model;
        this.price = price;
        this.color = color;
        this.size = size;
    }

    public void faceTime(long phoneNumber){
        System.out.println(model+ "able to call the phone number "+ phoneNumber+" with facetime");
    }

    public void faceTime(String email){
        System.out.println(model+ "able to enter the email "+ email+" for facetime");
    }

    public void call(long phoneNumber){
        System.out.println(model+ "able to call this number: "+phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(model+ "able to write a text message to this number "+ phoneNumber);
    }

    public String toString() {
        return "IPhone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
