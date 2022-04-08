package day16_Loops;

import java.util.Scanner;

public class frequencyJava {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter many times word 'Java':");
        String word = scan.nextLine();
        int result = 0;
        for (int i = 0; i < word.length()-3 ; i++) {
            String solution = word.substring(i, i+4);
            if (solution.equalsIgnoreCase("java")){
                result++;
            }
        }
        System.out.println(result);


    }
}
