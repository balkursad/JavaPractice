package day18NestedLoop;

import java.util.Scanner;

public class CalculateTwoNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result = 0;
        while(true) {
            System.out.println("enter first number:");
            int a = scan.nextInt();
            System.out.println("enter operator");
            String operator = scan.next();
            while (!(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/"))) {
                System.err.println("Invalid operator. Re-Enter");
                operator = scan.next();
            }
            System.out.println("enter second number:");
            int b = scan.nextInt();
            result = (operator.equals("+") ? a + b : (operator.equals("-") ? a - b : (operator.equals("*")) ? a * b : a / b));
            System.out.println("result: "+result);
            System.out.println("Do you want to continue?");
            String answer = scan.next();
            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.err.println("ınvalid Entry. Please re-enter");
                answer = scan.next();
            }

            if (answer.equalsIgnoreCase("no")) {

                System.out.println("have a nice day");
                break;
            }
        }


    }
}
