package day12_Scanner;

import java.util.Scanner;

public class StockMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many total shares you have already?");
        int share = scan.nextInt();

        System.out.println("How much is your total value in the stock market?");
        double value = scan.nextDouble();

        scan.nextLine();
        System.out.println("Enter the name of the company you have the most shares in?");
        String company = scan.nextLine();

        System.out.println("Your total stock market holding is $"+value+" which is made up of "+share+" shares. "+company+" is your company.");


    }

}
