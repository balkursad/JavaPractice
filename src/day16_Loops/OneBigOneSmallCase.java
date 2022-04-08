package day16_Loops;

import java.util.Locale;

public class OneBigOneSmallCase {

    public static void main(String[] args) {

        String word = "abcdefghjklm noprstuvyz";
        String solution = "";
        String direction = "uppercase";
        for (int i = 0; i < word.length() ; i++) {
            String helper = ""+word.charAt(i);
            if (helper.equals(" ")){
                solution +=" ";
            }else if (direction.equals("uppercase")){
                solution += helper.toUpperCase(Locale.ROOT);
                direction = "lowercase";
            }else{
                solution += helper.toLowerCase(Locale.ROOT);
                direction = "uppercase";
            }

        }
        System.out.println(solution);



    }
}
/*
Input:  abcdef hijklm
output:AbCdEf HiJkLm

 */
