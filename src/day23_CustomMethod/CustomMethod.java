package day23_CustomMethod;

import java.util.Arrays;
import java.util.Locale;

public class CustomMethod {

    public static void main(String[] args) {

        oddNumbers();
        evenNumbers();
        eligibleToBuyAlcohol(15);
        eligibleToVote(21,"USA");
        grade(90);
        circleParameter(5);
        squareArea(10);
        convertEuro(10);
        convertLira(100);
        convertKg(5);
        PositiveOrNegative(-5);
        printEachChar("Kursad");
        printEachElement(new int[]{1,2,3,4,5,10});
        calculator(5,5,'*');
        nameRegularFormat("KURSAD","bal");
        anagram("silntj", "listen");



    }

    public static void oddNumbers(){
        for (int i = 1; i < 100; i+=2) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void evenNumbers(){
        for (int i = 2; i <101 ; i+=2) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void eligibleToBuyAlcohol(int age){
        if(age>18){
            System.out.println("Eligible to buy alcohol");
        }else{
            System.out.println("Not eligible to buy alcohol");
        }
    }
    public static void eligibleToVote(int age, String nation){
        if (age>18&&nation.equals("USA")){
            System.out.println("Eligible to Vote");
        }else{
            System.out.println("Not eligible to Vote");
        }
    }
    public static void grade(int score){
        String result= "";
        if (score>100||score<0){
            result = "Invalid";
        }else if(score>=90){
            result="A";
        }else if(score>=80){
            result="B";
        }else if(score>=70){
            result="C";
        }else if (score>=60){
            result="D";
        }else{
            result="F";
        }
        System.out.println(result);

    }
    public static void circleParameter(int radius){
        System.out.println(radius*2.14*radius);
    }
    public static void squareArea(int side){
        System.out.println(side*side);
    }
    public static void convertEuro(int dollar){
        System.out.println(dollar*1.11);
    }
    public static void convertLira(int dollar){
        System.out.println(dollar*0.07);
    }
    public static void convertKg(int libre){
        System.out.println(libre*2);
    }
    public static void PositiveOrNegative(int number){
        if (number>0){
            System.out.println("positive");
        }else if (number==0){
            System.out.println("zero");
        }else{
            System.out.println("negative");
        }
    }
    public static void printEachChar(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void printEachElement(int[] arr){
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void calculator(int num1, int num2, char op){
        int result = 0;
        if (op=='+'){
            result=num1+num2;
        }else if (op=='-'){
            result=num1-num2;

        }else if (op == '*'){
            result=num1*num2;
        }else if (op=='/'){
            result=num1/num2;
        }else{
            System.out.println("Invalid");
        }
        System.out.println(result);
    }
    public static void nameRegularFormat(String firstName, String lastName){
        String fullname = "";
        fullname+=""+firstName.toUpperCase(Locale.ROOT).charAt(0);
        for (int i = 1; i < firstName.length(); i++) {
            fullname+=""+firstName.toLowerCase(Locale.ROOT).charAt(i);
        }
        fullname+=" "+lastName.toUpperCase(Locale.ROOT).charAt(0);
        for (int i = 1; i < lastName.length(); i++) {
            fullname+=""+lastName.charAt(i);
        }
        System.out.println(fullname);

    }
    public static void anagram(String str1, String str2){
        String result = "";
        for (int i = 0; i < str1.length(); i++) {
            char y = str1.charAt(i);
            for (int j = 0; j < str2.length(); j++) {
                char x = str2.charAt(j);
                if (y==x){
                    result+=""+y;
                    break;
            }
        }
            }
        if (result.equals(str1)){
            System.out.println(str1+" and "+str2+" are anagram.");
        }else{
            System.out.println("They are not anagram.");
        }
    }

}
