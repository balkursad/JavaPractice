package day17_WhileLoops;

import java.util.Scanner;

public class divisible3_5_15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = scan.nextInt();
        int b= 0;
        String three = "Divisible by 3: ";
        String five = "Divisible by 5: ";
        String fifteen = "Divisible by 15: ";

        while (b<=a){
            ++b;

            if (b%15==0){
                fifteen+=" "+b;

            }else if (b%5==0){
                five += " "+b;

            }else if (b%3==0){
                three += " "+b;

            }
        }
        System.out.println(fifteen);
        System.out.println(five);
        System.out.println(three);


    }
}
