package day10_NestedIf_Ternary;

import java.io.FilterOutputStream;

public class BiggerNum {
    public static void main(String[] args) {
        int n1 = 15 , n2= 125, n3=35;

        String biggest = (n1>n2&&n1>n3)? "n1 is bigger" : (n2>n1&&n2>n3)? "n2 is bigger" : "n3 is bigger";
        System.out.println(biggest);



    }


}
