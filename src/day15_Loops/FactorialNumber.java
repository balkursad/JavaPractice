package day15_Loops;

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {
        int sum = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive Number");
        int number = scan.nextInt();
        for ( int i = number; i>0; i-- ){
            sum *= i;
        }

        System.out.println("sum = " + sum);

    }
}
