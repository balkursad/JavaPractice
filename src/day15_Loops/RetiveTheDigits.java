package day15_Loops;

import java.util.Scanner;

public class RetiveTheDigits {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("biseyler yaz");
        String retive = scan.nextLine(),
        letters = "", digits="", specialChars = "";
        for (int i = 0; retive.length()>i; i++){
            char what = retive.charAt(i);
            if (what >='0' && what<='9'){
                digits += what;
            }else if(what >='a' && what <='z' || what >='A' && what <='Z' ){
                letters += what ;
            }else{
                specialChars += what;
            }
        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);



    }
}
