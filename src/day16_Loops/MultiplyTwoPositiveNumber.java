package day16_Loops;

import java.util.Scanner;

public class MultiplyTwoPositiveNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Give me 2 numbers");
        int a = scan.nextInt(),
                b = scan.nextInt();
        int result = 0;
        if (a>0 && b>0) {
            while (a > 0) {
                result += b;
                a--;
            }

            System.out.println(result);
        }else{
            System.out.println("must be positive");
        }



    }
}
