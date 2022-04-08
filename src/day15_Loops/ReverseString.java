package day15_Loops;

public class ReverseString {

    public static void main(String[] args) {

        String word = "Wooden Spoon";
        String total = "";
        for (int i = 1; i<=word.length(); i++){
            total += word.charAt(word.length()-i);

        }
        System.out.println(total);


    }
}
