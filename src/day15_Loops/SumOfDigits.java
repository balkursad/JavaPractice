package day15_Loops;

public class SumOfDigits {

    public static void main(String[] args) {

        String word = "A141B2hfC3";
        int sum = 0;
        for (int i = 0; i<word.length(); i++){
            char what = word.charAt(i);

            if (what>='0' && what <='9'){
                sum += what-48 ;
            }
        }
        System.out.println(sum);

    }

}
