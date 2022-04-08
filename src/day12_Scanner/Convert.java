package day12_Scanner;
import java.util.Scanner;
public class Convert {
    public static void main(String[] args) {
        System.out.println("Enter cents");
        Scanner scan= new Scanner(System.in);
        int  input = scan.nextInt();
        int dolar = input/100;
        int cent = input%100;
        if (input>0) {
            System.out.println(input + " cents equal to: " + dolar + " dollars and " + cent + " cents.");
        }



    }

}
/*
3. Write a program that can convert cents to dollars, if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents

 */
