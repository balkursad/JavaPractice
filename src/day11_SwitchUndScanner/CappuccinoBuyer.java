package day11_SwitchUndScanner;

import java.util.Scanner;
public class CappuccinoBuyer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Select the size");


        String size2 = scan.nextLine();
        scan.close();





        if (size2.equals("tall") || size2.equals("grande") || size2.equals("venti")) {
            if (size2.equals("tall")) {
                System.out.println("price is $3.69\n" + "90 calories");
            } else if (size2.equals("grande")) {
                System.out.println("price is $3.99\n" + "120 calories");
            } else {
                System.out.println("price is $4.29\n" + "150 calories");
            }
        }else {
            System.out.println("Invalid size");
        }








      String size3 = "tall";
switch (size3){
    case "tall":
        System.out.println("price is $3.69\n" + "90 calories");
        break;
    case "grande":
        System.out.println("price is $3.99\n"+"120 calories");
        break;
    case "venti":
        System.out.println("price is $4.29\n"+"150 calories");
        break;
    default:
        System.out.println("invalid");

}




       String size1 = "tall";

       if (size1 == "tall" || size1 == "grande" || size1=="venti"){

           switch (size1){
               case "tall":
                   System.out.println("price is $3.69\n" + "90 calories");
                   break;
               case "grande":
                   System.out.println("price is $3.99\n"+"120 calories");
                   break;
               default:
                   System.out.println("price is $4.29\n"+"150 calories");
           }
       }else{

           System.out.println("invalid");
       }




   }



}
/*1. Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino
			Valid sizes are tall, grande, venti and their price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output should be "Invalid Size"


			Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed

 */
