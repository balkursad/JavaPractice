package day12_Scanner;
import java.util.Scanner;
public class PlaceAnOrder {
    public static void main(String[] args) {

        System.out.println("Enter your product name,  price, quantity and firstname");

        Scanner scan= new Scanner(System.in);
        String productName = scan.nextLine();
        double price = scan.nextDouble();
        int quantity = scan.nextInt();
        String firstName = scan.next();

        double totalPrice = price*quantity;
        System.out.println(firstName+", your order for "+quantity+" "+productName+" has been places. Your total is "+totalPrice+".");




    }

}
/*
6. PlaceAnOrder task:
                Ask User to enter the prodcut name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.
 */