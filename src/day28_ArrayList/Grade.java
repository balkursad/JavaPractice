package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Grade {

    public static void main(String[] args) {

        ArrayList<Integer>  scores = new ArrayList<>();
        scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));
        ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59

        for (Integer each : scores) {
            if (each>=90){
                gradeOfA.add(each);
            }else if(each>=80&&each<90){
                gradeOfB.add(each);
            }else if (each>=70&&each<80){
                gradeOfC.add(each);
            }else if (each>=60&&each<70){
                gradeOfD.add(each);
            }else{
                gradeOfF.add(each);
            }
        }
        /*System.out.println("gradeOfA = " + gradeOfA);
        System.out.println("gradeOfB = " + gradeOfB);
        System.out.println("gradeOfC = " + gradeOfC);
        System.out.println("gradeOfD = " + gradeOfD);
        System.out.println("gradeOfF = " + gradeOfF);

         */

        System.out.println("gradeOfA = "+gradeOfA.size());
        System.out.println("gradeOfB = " + gradeOfB.size());
        System.out.println("gradeOfC = " + gradeOfC.size());
        System.out.println("gradeOfD = " + gradeOfD.size());
        System.out.println("gradeOfF = " + gradeOfF.size());

    }
}
