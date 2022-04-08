package day17_WhileLoops;

import java.util.Scanner;

public class InsurenceQuote {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scan.nextLine();
        System.out.println("Enter your gender:");
        String gender = scan.next();
        while(!(gender.equalsIgnoreCase("m")||gender.equalsIgnoreCase("f"))){
            System.out.println("Invalid Entry. Please re-enter");
            gender = scan.next();
        }
        System.out.println("Are you married?");
        String isMarried = scan.next();
        while(!(isMarried.equalsIgnoreCase("yes")||gender.equalsIgnoreCase("no"))) {
            System.err.println("Invalid Entry. Please re-enter");
            isMarried = scan.next();
        }
        System.out.println("Enter your age:");
        int age = scan.nextInt();
        while(!(age>0&&age<120)){
            System.err.println("Invalid Entry. Please re-enter");
            age = scan.nextInt();
        }
        System.out.println("How many miles do you drive in a day?");
        int mile = scan.nextInt();
        while(mile<5){
            System.err.println("Invalid Entry. Please re-enter");
            mile = scan.nextInt();
        }
        scan.nextLine();
        System.out.println("Do you want full coverage or liability insurance?");
        String insurance = scan.next();
        while( !(insurance.equalsIgnoreCase("full coverage")||insurance.equalsIgnoreCase("liability"))){
            System.err.println("Invalid Entry, please re-enter! full coverage or liability?");
            insurance = scan.nextLine();
        }
        System.out.println("Did you have any accident or claims in past 5 years?");
        String isYes = scan.next();
        while(!(isYes.equalsIgnoreCase("yes")||isYes.equalsIgnoreCase("no"))){
            System.err.println("Invalid Entry. Please re-enter. Yes or No");
            isYes = scan.next();
        }
        System.out.println("Has your car an anti-theft device?");
        String device = scan.next();
        while(!(device.equalsIgnoreCase("yes")||device.equalsIgnoreCase("no"))) {
            System.err.println("Invalid Entry. Please re-enter. Yes or No");
            device = scan.next();
        }
        double result=0;
        if (insurance.equalsIgnoreCase("liability")){
            if (age>=25){
                result =50;
            }else{
                result = 90;
            }
            if(mile<=10){
                result+=10;
            }else if (mile>10 && mile<=50){
                result+=30;
            }else{
                result+=50;
            }
        }else{
            if (age>=25){
                result =120;
            }else{
                result = 160;
            }
            if(mile<=10){
                result+=20;
            }else if (mile>10 && mile<=50){
                result+=40;
            }else{
                result+=70;
            }
        }
        double discountRate=0;


        if (device.equalsIgnoreCase("yes")) {
            discountRate = 0.05;
            }
        if (isYes.equalsIgnoreCase("yes")) {
            discountRate= 0.15;
            }else{
            discountRate=0.1;
        }
        if (isMarried.equalsIgnoreCase("yes")){
            discountRate= 0.05;
        }
        double total = result-(result-result*discountRate);

        System.out.println("name = " + name);
        System.out.println("gender = " + gender);
        System.out.println("age = " + age);
        System.out.println("isMarried = " + isMarried);
        System.out.println("device = " + device);
        System.out.println("isYes = " + isYes);
        System.out.println("insurance = " + insurance);
        System.out.println("total = " + total);

        scan.close();



    }
}
