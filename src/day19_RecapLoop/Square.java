package day19_RecapLoop;

import java.util.Scanner;

public class Square {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter side of the square:");
            int side = scan.nextInt();
            if (side <= 0) {
                System.out.println("Invalid Entry for the side of the square");
                System.exit(0);
            }
            System.out.println("Area of square = " + side * side);
            System.out.println("Perimeter os square = " + 4 * side);

            System.out.println("Would you like to calculate another Square?");
            String answer = scan.next();
            while(true){
                if (!(answer.equalsIgnoreCase("no")||answer.equalsIgnoreCase("yes"))){
                    System.out.println("please re-enter");
                    System.out.println("Would you like to calculate another Square?");
                    answer = scan.next();
                }else
                    break;
            }

            if (answer.equalsIgnoreCase("yes")) {
                continue;
            }else
                System.out.println("Thank you for using Cydeo Square Calculator APP");
                break;


        }

    }
}
