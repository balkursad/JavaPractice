package day19_RecapLoop;

import java.util.Scanner;

public class ChFrequency {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String");
        String word = scan.nextLine();
        int max =0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int count =0;
            for (int j = 0; j < word.length(); j++) {
                char compare = word.charAt(j);

                if (ch==compare){
                    count++;
                }

            }
            if (count>max){
                max = count;
            }

        }
        System.out.println(max);


    }
}
