package day16_Loops;

import java.util.Scanner;

public class PositiveNegative {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int result =0, result2= 0;
        for (int i = 1; i < 6; i++) {
            System.out.println("Enter a number");
            int num = scan.nextInt();
            if (num>0){
                result++;
            }else {
                result2++;
            }
        }
        System.out.println("There are "+result+ " positive and "+ result2+ " negative numbers");




    }
}
