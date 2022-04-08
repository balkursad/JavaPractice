package day13_String;

import java.util.Locale;
import java.util.Scanner;

public class calledTravel {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pass = "", country = "", peopleYouTravelWith = "";
        byte numberOfBags;
        short howManyPeople;
        int years;
        double costAmount = 1000;

        System.out.println("Do you hava a valid Passport");
        pass = scan.nextLine().toLowerCase(Locale.ROOT);
        if (pass.equals("yes")) {
            scan.nextLine();
            System.out.println("Where are you going to travel?");
            country = scan.nextLine().toLowerCase(Locale.ROOT);
            System.out.println("How many bags do you have?");
            numberOfBags = scan.nextByte();
            costAmount += 50 * numberOfBags;
            System.out.println("How many people do you want to travel with?");
            howManyPeople = scan.nextShort();
            if (howManyPeople < 3) {
                costAmount -= howManyPeople * 100;
            } else
                costAmount -= 300;

        scan.nextLine();
        System.out.println("Enter the name of the people that they will travel with in one line. (Separate please with comma.");
        peopleYouTravelWith = scan.nextLine();


        System.out.println("your ticket booked to " + country + ". We have charged extra for the " + numberOfBags + " bags but you are travelling with " +
                peopleYouTravelWith + " so we are giving a discount. your total cost is " + costAmount);
    }else {
            int renewalCost = 200;
            System.out.println("When does your passport expired?");
            int expired = scan.nextInt();
            renewalCost += expired*75;
            scan.nextLine();
            System.out.println("Which country do you want to travel?");
            country = scan.nextLine();

        }






    }
}
