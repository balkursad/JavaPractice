package day18NestedLoop;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int total = 0;
        while(true) {
            int price = 0;
            System.out.println("Which bedroom do you want to reserve?");
            String reserve = scan.nextLine();
            while (!(reserve.equalsIgnoreCase("king Bed") || reserve.equalsIgnoreCase("Queen Bed") || reserve.equalsIgnoreCase("single Bed"))) {
                System.err.println("Invalid Entry. Please re-enter");
                reserve = scan.nextLine();
            }
            System.out.println("How many nights do you want to stay");
            int stay = scan.nextInt();
            while (stay <= 0) {
                System.err.println("Invalid Entry. Please re-enter");
                stay = scan.nextInt();
            }
            System.out.println("would you like to reserve another room?");
            String anotherRoom = scan.next();
            while (!(anotherRoom.equalsIgnoreCase("yes") || anotherRoom.equalsIgnoreCase("no"))) {
                System.err.println("Invalid Entry. Please re-enter");
                anotherRoom = scan.next();
            }
            if(reserve.equalsIgnoreCase("Queen Bed")){
                price+=100;
            }else if(reserve.equalsIgnoreCase("King Bed")){
                price+=120;
            }else{
                price+=80;
            }
            price*=stay;
            total+=price;
            if (anotherRoom.equalsIgnoreCase("no")) {
                System.out.println("Total price : "+total);
                break;
            }


        }

    }
}
