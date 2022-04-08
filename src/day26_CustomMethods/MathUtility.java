package day26_CustomMethods;



public class MathUtility {

    public static void main(String[] args) {

        int max= max(5,10);
        System.out.println(max);
        System.out.println(min(10.5,-2.5));



    }

    public static void sumOfTwoNumbers( int num1, int num2){

        System.out.println(num1+num2);

    }

    public static void sumOfTwoNumbers( double num1, double num2){
        System.out.println(num1+num2);
    }

    public static void subtractionOfTwoNumbers(int num1, int num2){
        System.out.println(num1-num2);
    }

    public static void subtractionOfTwoNumbers(double num1, double num2){
        System.out.println(num1-num2);
    }

    public static void multiplyOfTwoNumbers(int num1, int num2){
        System.out.println(num1-num2);
    }
    public static void multiplyOfTwoNumbers(double num1, double num2){
        System.out.println(num1-num2);
    }

    public static double divisionOfTwoNumbers(double num1, double num2){
       double result = num1/num2;
        return result;
    }

    public static void checkEven(int num){
        if (num%2==0){
            System.out.println("this number is even number.");
        }
    }

    public static void checkOdd(int num){
        if (num%2!=0){
            System.out.println("this number is odd number");
        }
    }

    public static int max(int num1, int num2){
        int max = 0;
        if (num1>num2){
            max = num1;

        }else {
            max=num2;

        }
        return max;
    }

    public static double max(double num1, double num2){
        double max=0;
        if (num1>num2){
            max=num1;

        }else {
            max=num2;

        }
        return max;
    }

    public static int min(int num1, int num2){
        int min=0;
        if (num1>num2){
            min=num2;

        }else {
            min=num1;

        }
        return min;
    }

    public static double min(double num1, double num2){
        double min=0;
        if (num1>num2){
            min=num2;

        }else {
            min=num1;

        }
        return min;
    }







}
