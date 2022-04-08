package day33_CustomClassStatics;

public class Person {

    public String name;
    public int age;
    public char gender;

    public static boolean isHuman, hasNose, hasWings;
    public static int numberOfHead, numberOfEyes;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    static{
        isHuman = true;
        hasNose=true;
        hasWings=false;
        numberOfEyes=2;
        numberOfHead=1;
    }

    public void eat(String food){
        System.out.println(name+ " is eating +" +food);
    }

    public void drink(String drink){
        System.out.println(name+ " is drinking "+ drink);
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
