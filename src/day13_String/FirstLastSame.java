package day13_String;

public class FirstLastSame {

    public static void main(String[] args) {

        String word = "levent  ";
        word = word.trim();
        String first = ""+ word.charAt(0);
        String last =""+ word.charAt(word.length()-1);

        if (first.equals(last)){
            System.out.println("same");
        }else{
            System.out.println("not same");
        }



    }
}
