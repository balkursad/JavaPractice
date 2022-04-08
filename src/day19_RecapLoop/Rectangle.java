package day19_RecapLoop;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        while (true) {
            System.out.println("Enter the length of the Rectangle:");
            int side1 = scan.nextInt();

            if (side1 <= 0) {
                System.out.println("Invalid Entry for the length of the rectangle");
                System.exit(0);
            }
            System.out.println("Enter the width of the Rectangle:");
            int side2 = scan.nextInt();
            if (side2 <= 0) {
                System.out.println("Invalid Entry for the length of the rectangle");
                System.exit(0);
            }
            System.out.println("Area of rectangle = " + side1 * side2);
            System.out.println("Perimeter of rectangle = " + (side1 + side2) * 2);

            System.out.println("Would you like to calculate another Rectangle?");
            String answer = scan.next();
            while (true) {
                if (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                    System.out.println("re-enter");
                    System.out.println("Would you like to calculate another Rectangle?");
                    answer = scan.next();
                } else
                    break;
            }
            if (answer.equalsIgnoreCase("yes")){
                continue;
            }else{
                System.out.println("Thank you for using Cydeo Rectangle Calculator APP");
                break;
            }


        }
    }
}
