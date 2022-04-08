package day17_WhileLoops;

import java.util.Scanner;

public class TwoNumberAndOperator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers and a operator");
        int a = scan.nextInt(), b = scan.nextInt();
        String c = scan.next();
        int result = 0;
        while(!(c.equals("-")||c.equals("*")||c.equals("*")||c.equals("/"))) {
            System.err.println("please use only +, -, *, /");
            c = scan.next();
        }
        if (c.equals("+")){
            result = a+b;
        }else if (c.equals("-")){
            result=a-b;
        }else if (c.equals("*")){
            result=a*b;
        }else{
            result=a/b;
        }

        System.out.println(result);





    }

}
