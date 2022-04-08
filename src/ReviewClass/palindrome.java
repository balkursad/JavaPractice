package ReviewClass;

import java.util.Locale;
import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a 5 character word");
        String word = scan.next();
        String result = "";
        for (int i = 4; i > -1 ; i--) {
           char ch = word.charAt(i);
           result += ""+ch;

        }
        if (result.equalsIgnoreCase(word)){
            System.out.println("this word is palindrome");
        }else
            System.out.println("not palindrome");

        int a = 2;
        a = a++;
        System.out.println("a = " + a);


    }
}
