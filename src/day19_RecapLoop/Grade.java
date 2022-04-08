package day19_RecapLoop;

import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your score");
            int score = scan.nextInt();
            if (score > 100 || score < 0) {
                System.out.println("Invalid Entry");
                System.exit(0);
            }
            char sc;
            if (score >= 90) {
                sc = 'A';
            } else if (score >= 80) {
                sc = 'B';
            } else if (score >= 70) {
                sc = 'C';
            } else if (score >= 60) {
                sc = 'D';
            } else
                sc = 'F';

            System.out.println(sc);

            System.out.println("Would you like to continue?");
            String answer = scan.next();
            while (true) {
                if (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                    System.out.println("re-enter");
                    answer = scan.next();
                } else
                    break;
            }
            if (answer.equalsIgnoreCase("yes")) {
continue;
            }else{
                System.out.println("Thank you");
break;}

        }
    }
}
