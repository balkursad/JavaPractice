package day17_WhileLoops;

import java.util.Scanner;

public class DivideTwoNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two positive number:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int solution = 0;

        while (a>=b){
            a-=b;
            solution++;
        }
        System.out.println("result is "+solution+" with remainder of "+ a);





    }
}
