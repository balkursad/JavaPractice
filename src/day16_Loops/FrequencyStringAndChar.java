package day16_Loops;

import java.util.Scanner;

public class FrequencyStringAndChar {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();
        System.out.println("Enter a letter, which is included in the word");
        String letter = scan.next();
        int result = 0;
        for (int i = 0; i < word.length() ; i++) {
            String ch =""+ word.charAt(i);
            if (ch.equalsIgnoreCase(letter)){
                result++;
            }

        }
        System.out.println(result);


    }
}
