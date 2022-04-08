package day9_IfElseStatement;

public class FINRA {
    public static void main(String[] args) {
        int number = 15;
        if ((number%3==0&&number%5==0)){
            System.out.println("FINRA");
        }else if (number%5==0){
            System.out.println("RA");
        }else if (number%3==0){
            System.out.println("FIN");
        }else{
            System.out.println(number);
        }



    }
}
