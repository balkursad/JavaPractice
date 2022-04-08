package day9_IfElseStatement;

public class Calculator {
    public static void main(String[] args) {
        double n1 = 30, n2 = 5;
        char mathOperator = '/';
        System.out.println(n1+mathOperator+n2);

        if (mathOperator=='+'){
            System.out.println(n1+n2);
        }else if (mathOperator=='-'){
            System.out.println(n1-n2);
        }else if (mathOperator=='*'){
            System.out.println(n1*n2);
        }else if (mathOperator=='/'){
            System.out.println(n1/n2);
        }else{
            System.out.println("adam gibi gir su degerleri");
        }





    }
}
