package day17_WhileLoops;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to book any room?");
        String answer = scan.nextLine();
        while(!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
            System.err.println("Invalid Entry. Please re-enter");
            answer = scan.nextLine();
        }
        if (answer.equalsIgnoreCase("yes")){

            System.out.println("Which type of room would you like reserve?");
            String answer2 = scan.nextLine();
            while (!(  answer2.equalsIgnoreCase("King Bed")|| answer2.equalsIgnoreCase("queen bed") ||  answer2.equalsIgnoreCase("single Bed") )){
                System.err.println("Invalid Room. Please try again.");
                answer2 = scan.nextLine();
            }
            if (answer2.equalsIgnoreCase("King Bed")){
                System.out.println("You reserved Kind Bed. It costs 120$");
            }else if (answer2.equalsIgnoreCase("queen bed")){
                System.out.println("You reserved Queen Bed. It costs 100$");
            }else{
                System.out.println("You reserved Single Bed. It costs 80$");
            }
        }else{
            System.out.println("Have a nice day!");
        }



    }
}
