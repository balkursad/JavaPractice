package day12_Scanner;

import java.util.Scanner;

public class MilesToKilometers {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double mile = scan.nextDouble();
        double km= mile*1.609;

        if (mile>0){
            System.out.println(mile+ " miles equal to: "+km+" kilometers");
        }


    }
}
/*
4. Write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers
 */
