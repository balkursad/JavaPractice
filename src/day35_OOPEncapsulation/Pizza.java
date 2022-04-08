package day35_OOPEncapsulation;

import java.util.Locale;

public class Pizza {

    private char size;
    private int numberOfCheeseTopping;
    private int numberOfPepperonitopping;

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperonitopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperonitopping(numberOfPepperonitopping);
    }

    public char getSize() {
        return size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public int getNumberOfPepperonitopping() {
        return numberOfPepperonitopping;
    }

    public void setSize(char size) {
        if (!((size+"").toLowerCase(Locale.ROOT).equals("s")||(size+"").equalsIgnoreCase("m")||(size+"").equalsIgnoreCase("l"))){
            return;
        }
        this.size = size;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if (numberOfCheeseTopping<0||(size+"").equalsIgnoreCase("s")&&numberOfCheeseTopping>3||(size+"").equalsIgnoreCase("m")&&numberOfCheeseTopping>4||(size+"").equalsIgnoreCase("l")&&numberOfCheeseTopping>5){
            return;
        }
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public void setNumberOfPepperonitopping(int numberOfPepperonitopping) {
        if (numberOfPepperonitopping<0||(size+"").equalsIgnoreCase("s")&&numberOfPepperonitopping>4||(size+"").equalsIgnoreCase("m")&&numberOfPepperonitopping>5||(size+"").equalsIgnoreCase("l")&&numberOfPepperonitopping>6){
            return;
        }
        this.numberOfPepperonitopping = numberOfPepperonitopping;
    }

    public double calcCost(){
        double total = 0;
        if ((size+"").equalsIgnoreCase("s")){
            total = 10 + numberOfCheeseTopping*2+numberOfPepperonitopping*2;
        }else if ((size+"").equalsIgnoreCase("m")){
            total= 12 + numberOfCheeseTopping*2+numberOfPepperonitopping*2;
        }else{
            total = 14 + numberOfCheeseTopping*2+numberOfPepperonitopping*2;
        }
        return total;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperonitopping=" + numberOfPepperonitopping +
                '}';
    }
}
