package day33_CustomClassStatics;

public class Dog {

    public String breed;
    public char size;
    public char gender;
    public int age;
    public String color;
    public static int numberOfLegs;
    public static int numberOfEyes;
    public static int numberOfWings;
    public static boolean isFriendly;

    static {
        numberOfEyes=2;
        numberOfLegs=4;
        numberOfWings=0;
        isFriendly=true;
    }

    public Dog(String breed, char size, char gender, int age, String color) {
        this.breed = breed;
        this.size = size;
        this.gender = gender;
        this.age = age;
        this.color = color;
    }

    public void eat(){
        System.out.println(breed+ " eat fish");
    }

    public void sleep(){
        System.out.println(breed+" sleep long");
    }

    public void play(){
        System.out.println(breed+" are playing well");
    }

    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size=" + size +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
