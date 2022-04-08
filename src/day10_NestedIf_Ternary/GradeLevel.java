package day10_NestedIf_Ternary;

public class GradeLevel {
    public static void main(String[] args) {
        byte level = 0;

        if (level<=18 &&level>=1){

            String GradeLevel = (level<=5)? "Elementary School" : (level<=8)? "Middle School" : (level<=12)? "High School" : (level<=16)? "College" : "Grad Scool";
            System.out.println(GradeLevel);
        }else{
            System.out.println("please put the number between 1-18");

        }





    }


}
