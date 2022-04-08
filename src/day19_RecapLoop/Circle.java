package day19_RecapLoop;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("Enter the radius of the circle:");
            double radius = scan.nextDouble();
            if (radius <= 0) {
                System.out.println("Invalid Entry for the radius of the circle");

            System.exit(0);
            }
            System.out.println("Diameter = " + (radius * 2));
            System.out.println("Area = " + (3.14 * radius * radius));
            System.out.println("Perimeter = " + (3.14 * 2 * radius));

            System.out.println("Would you like to calculate another circle?");
            String answer = scan.next();

            while(true){
                if (!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
                    System.out.println("please re-enter");
                    System.out.println("Would you like to calculate another circle?");
                    answer = scan.next();
                }else
                    break;

            }

            if (answer.equalsIgnoreCase("No")){
                System.out.println("Thank you for using Cydeo Circle Calculator APP");
                break;
            }else {
                continue;
            }

            }


    }
}
