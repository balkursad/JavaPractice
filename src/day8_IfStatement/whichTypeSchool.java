package day8_IfStatement;

public class whichTypeSchool {
    public static void main(String[] args) {
        byte grade = 19;

        boolean elementery = grade>=1&&grade<=5;
        boolean middle = grade>=6&&grade<=8;
        boolean high = grade >=9 && grade<=12;
        boolean collage = grade >=13 && grade <= 16;
        boolean grad = grade ==17 || grade==18;

        if (elementery){
            System.out.println("Sie können Elementary School gehen");
        }
        if (middle){
            System.out.println("Sie können Middle School gehen");
        }
        if (high){
            System.out.println("Sie können High School gehen");
        }
        if (collage){
            System.out.println("Sie können Collage gehen");
        }
        if (grad){
            System.out.println("Sie können Grad School gehen");
        }




    }



}
