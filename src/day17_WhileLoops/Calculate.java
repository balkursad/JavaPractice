package day17_WhileLoops;

import java.util.Scanner;

public class Calculate {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int result = 0;
        System.out.println("Give mi some numbers :");
        while(true) {
            int answer = scan.nextInt();
            result += answer;
            if (answer <0){
                break;
            }
        }

        System.out.println("result : "+result);

    }
}
