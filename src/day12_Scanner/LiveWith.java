package day12_Scanner;

import java.util.Scanner;

public class LiveWith {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int people = scan.nextInt();
        if (people>0){
            switch (people){
                case 1: case 2:
                System.out.println("Live with less than 3 people");
                break;
                case 3: case 4: case 5: case 6:
                System.out.println("Live with 3 - 6 people");
                break;
                default:
                    System.out.println("Live with more than 6 people");
            }
        }else{
            System.out.println("invalid");
        }



    }

}
/*1. Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"

 */
