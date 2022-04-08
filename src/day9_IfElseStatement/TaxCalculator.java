package day9_IfElseStatement;

public class TaxCalculator {
    public static void main(String[] args) {
        double salary = 750000;
        char ifMarried = 'S';
        if (salary>=130000&&ifMarried=='M'){
            double married1 = salary-(salary*0.30);
            System.out.println((married1));
        }else if (salary>=130000&&ifMarried=='S'){
            double single1 = salary-(salary*0.35);
            System.out.println(single1);
        }else if (salary>=100000&&salary<130000&&ifMarried=='M'){
            double married2 = salary-(salary*0.25);
            System.out.println(married2);
        }else if (salary>=100000&&salary<130000&&ifMarried=='S'){
            double single2 = salary-(salary*0.30);
            System.out.println(single2);
        }else if (salary<100000&&ifMarried=='M'){
            double married3 = salary-(salary*0.20);
            System.out.println(married3);
        }else if(salary<100000&&ifMarried=='S' ){
            double single3 = salary -(salary*0.25);
            System.out.println(single3);
        }



    }
}
