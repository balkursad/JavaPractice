package day15_Loops;

import java.util.Scanner;

public class CalculateGivenNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sum =0;
        System.out.println("Enter a positive number:");
        int number = scan.nextInt();
        for (int i =1; i<=number; i++){
            sum+=i;
        }
        System.out.println("sum = " + sum);

    }
}
