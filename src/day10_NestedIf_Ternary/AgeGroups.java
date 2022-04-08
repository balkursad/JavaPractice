package day10_NestedIf_Ternary;

public class AgeGroups {
    public static void main(String[] args) {
        int age = 55;
        String result= "";
        if (age>0&&age<150){
             result=(age<21)? "Teenager" : (age>=21&&age<55)? "Adult" : "Senior";



        }else{
            result="Invalid";
        }

        System.out.println(result);

    }



}
