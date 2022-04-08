package day27_Wrapping;

public class CompareUpperAndLower {

    public static void main(String[] args) {

        String str = "JAVA java";

        int lower = 0;
        int upper = 0;

        for (char each: str.toCharArray()             ) {
            if (Character.isUpperCase(each)){
                upper++;
            }else if (Character.isLowerCase(each)){
                lower++;
            }
        }
        System.out.println(lower==upper);


    }

}
