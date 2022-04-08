package day10_NestedIf_Ternary;

public class Grade {
    public static void main(String[] args) {
        char grade = 'F';
        String result = "";
        if(grade>='A'&&grade<='F'){
            result = (grade=='A')? "excellent" : (grade=='B')? "great job" : (grade=='C')? "good" : (grade=='D')? "passed" : "failed";


        }else{
            result="invalid";
        }
        System.out.println(result);


    }

}
