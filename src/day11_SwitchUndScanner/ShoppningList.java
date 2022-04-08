package day11_SwitchUndScanner;
import java.util.Scanner;
public class ShoppningList {


        public static void main(String[] args) {
            //WRITE YOUR CODE HERE:
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter Item1 and its price:");
            String item1= scan.nextLine();
            int price1 = scan.nextInt();
            scan.nextLine();
            System.out.println("Enter Item2 and its price:");
            String item2 = scan.nextLine();
            int price2 = scan.nextInt();
            scan.nextLine();
            System.out.println("Enter Item3 and its price:");
            String item3 = scan.nextLine();
            int price3 = scan.nextInt();
            System.out.println("Item1: "+item1+" Price: "+price1+", Item2: "+item2+" Price: "+price2+", Item3: "+item3+" Price: "+price3+"\nTotal price: "+(price1+price2+price3));





    }


}
