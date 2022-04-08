package day13_String;

import java.sql.SQLOutput;

public class FirstLastCharacter {

    public static void main(String[] args) {

        String word = "KursadBal";
        String first = ""+ word.charAt(0);
        String last = ""+ word.charAt(word.length()-1);
        System.out.println("first is "+ first + " last is "+last);



    }
}
