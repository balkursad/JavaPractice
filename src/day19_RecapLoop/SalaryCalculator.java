package day19_RecapLoop;

import java.util.Scanner;

public class SalaryCalculator {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (true){

            System.out.println("How much you make a hour?");
            double salary = scan.nextDouble();
            if (salary<=0){
                System.out.println("Invalid Entry");
                System.exit(0);
            }
            System.out.println("How many hours do you work per week?");
            int weeklyHour = scan.nextInt();
            if (weeklyHour<1||weeklyHour>144){
                System.out.println("Invalid Entry");
                System.exit(0);
            }

            System.out.println("Enter your state tax rate");
            double taxRate = scan.nextDouble();
            if (taxRate<0||taxRate>10){
                System.out.println("Invalid Entry");
                System.exit(0);
            }
            salary = weeklyHour*salary;
            System.out.println("Gross Salary = "+salary);
            System.out.println("Federal Tax = "+(salary*0.26));
            System.out.println("State Tax = "+(salary*taxRate/100));
            System.out.println("Total Tax = "+((salary*0.26)+(salary*taxRate/100)));
            System.out.println("Net Income = "+(salary-(salary*0.26)-(salary*taxRate/100)));
            String answer = "";
            while (true) {
                System.out.println("Would you like to continue?");
                answer = scan.next();
                if (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                    System.out.println("Invalid Entry");
                    continue;
                } else
                    break;
            }

            if (answer.equalsIgnoreCase("yes")){
                continue;
            }else{
                System.out.println("Thank you for using Cydeo Salary Calculator APP");
                break;
            }



        }





    }
}
