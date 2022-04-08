package day13_String;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.nextLine();
        String result = "";

        if(word.length() ==  5){
                result += word.charAt(4);
                result += word.charAt(3);
                result += word.charAt(2);
                result += word.charAt(1);
                result += word.charAt(0);
        }else if(word.length()>5){
            System.out.println("too long");
        }else{
            System.out.println("too short");
        }

        System.out.println(result);
    }

}
