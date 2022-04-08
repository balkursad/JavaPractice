package day16_Loops;

import java.util.Scanner;

public class CatAndDog {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence which include only dog and cat");
        String word = scan.nextLine();
        int result1=0, result2 = 0;
        for (int i = 0; i < word.length()-2; i++) {
            String solution = word.substring(i, i+3);
            if (solution.equalsIgnoreCase("cat")){
                result1++;
            }
            if (solution.equalsIgnoreCase("dog")){
                result2++;
            }

        }
        System.out.println(result1==result2);

    }
}
