package day13_String;

import java.util.Scanner;

public class LongestString {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence1 = scan.nextLine();

        System.out.println("Enter second sentence");
        String sentence2 = scan.nextLine();

        if (sentence1.length()>sentence2.length()){
            System.out.println(sentence1);
        }else{
            System.out.println(sentence2);
        }




    }
}
