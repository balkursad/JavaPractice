package day13_String;

import java.util.Locale;
import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {

      /*
        Scanner scan = new Scanner(System.in);
        String quality = "";
        int numberOfPeople ;
        double  checkAmount , totalPay ,totalTip , perPersonPay=0 , perPersonTip = 0;

        System.out.println("Split or No split (Yes or No)?");
        String bill = scan.nextLine().toLowerCase(Locale.ROOT);
        System.out.println("Enter the number of people");
        numberOfPeople = scan.nextInt();
        System.out.println("Enter the check amount:");
        checkAmount = scan.nextDouble();
        scan.nextLine();
        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        quality = scan.nextLine().toLowerCase(Locale.ROOT);

        if (bill.equals("yes")){
            switch (quality){
                case "excellent":
                    totalTip = checkAmount*0.25;
                    totalPay = totalTip+checkAmount;
                    perPersonPay =totalPay/numberOfPeople;
                    perPersonTip = totalTip/numberOfPeople;
                    break;
                case "great":
                    totalTip = checkAmount*0.2;
                    totalPay = totalTip+checkAmount;
                    perPersonPay =totalPay/numberOfPeople;
                    perPersonTip = totalTip/numberOfPeople;
                    break;
                case "good":
                    totalTip = checkAmount*0.15;
                    totalPay = totalTip+checkAmount;
                    perPersonPay =totalPay/numberOfPeople;
                    perPersonTip = totalTip/numberOfPeople;
                    break;
                case "fair":
                    totalTip = checkAmount*0.1;
                    totalPay = totalTip+checkAmount;
                    perPersonPay =totalPay/numberOfPeople;
                    perPersonTip = totalTip/numberOfPeople;
                    break;
                default:
                    totalTip = checkAmount*0.05;
                    totalPay = totalTip+checkAmount;
                    perPersonPay =totalPay/numberOfPeople;
                    perPersonTip = totalTip/numberOfPeople;

            }
        }else {
            switch (quality) {
                case "excellent":
                    totalTip = checkAmount * 0.25;
                    totalPay = totalTip + checkAmount;

                    break;
                case "great":
                    totalTip = checkAmount * 0.2;
                    totalPay = totalTip + checkAmount;

                    break;
                case "good":
                    totalTip = checkAmount * 0.15;
                    totalPay = totalTip + checkAmount;

                    break;
                case "fair":
                    totalTip = checkAmount * 0.1;
                    totalPay = totalTip + checkAmount;

                    break;
                default:
                    totalTip = checkAmount * 0.05;
                    totalPay = totalTip + checkAmount;
            }
        }
        System.out.println("number of people = "+ numberOfPeople);
        System.out.println("Total to pay: "+ totalPay);
        System.out.println("Total tip: "+totalTip);
        System.out.println("Total per person: "+ perPersonPay);
        System.out.println("Tip per person: "+ perPersonTip);

       */
        Scanner scan = new Scanner(System.in);
        double totalPay=0, tip=0;
        System.out.println("Split or No split (Yes or No)?");
        String split = scan.nextLine().toLowerCase(Locale.ROOT);
        System.out.println("Enter the number of people");
        int numberOfPeople = scan.nextInt();
        System.out.println("Enter the check amount:");
        double checkAmount = scan.nextDouble();
        scan.nextLine();
        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        String quality = scan.nextLine().toLowerCase(Locale.ROOT);

        tip = (quality.equals("excellent")) ? checkAmount*0.25 : (quality.equals("great"))? checkAmount*0.2 : (quality.equals("good"))? checkAmount*0.15 :
                (quality.equals("fair"))? checkAmount*0.1 :  checkAmount*0.05 ;
        totalPay = checkAmount+tip;
        double totalPerPerson = totalPay/numberOfPeople;
        double totalperTip = tip/numberOfPeople;

        System.out.println("Number of people entered: "+numberOfPeople);
        System.out.println("Total to pay: "+ totalPay);
        System.out.println("Total tip: "+ tip);

        if (split.equals("yes")){
            System.out.println("Total per person: "+ totalPerPerson+ "\nTip per person: "+totalperTip);
        }


    }


}
/*
2. Create a class called TipCalculator, write a program for a tip calculator.
There will be different service quality benchmarks that will determine the tip given.
There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

		Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

	The program should display the following information based on the user input:

	Split or No split (Yes or No),  Number of people entered: (number) (each person = & in output) Check amount: (number) Service Quality: (String) Total to pay: Total tip: Total per person: Tip per person:

	Ex:
		Split or No split (Yes or No)?
		Yes
		Enter the number of people
		4
		Enter the check amount:
		476
		How was the service quality? (Excellent/Great/Good/Fair/Poor)
		Excellent

		output:
			Number of people entered: 4
			Total to pay: 595.0
			Total tip: 119.0
			Total per person: 148.75
			Tip per person: 29.75

	HINT: you will need to use .equals() method
 */