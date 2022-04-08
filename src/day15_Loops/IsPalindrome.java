package day15_Loops;

public class IsPalindrome {

    public static void main(String[] args) {

        String word = "tat";
        String result = "";

        for (int i = 1; word.length()>=i; i++){
            result += word.charAt(word.length()-i);
        }
        if( word.equalsIgnoreCase(result)  ) {
            System.out.println(word + " bir palindromedur.");
        }


    }

}
