package day27_Wrapping;

public class retrieveLetterDigitChar {
    public static void main(String[] args) {

        String str = "Wooden Spoon!";

        String special = "";
        String digit = "";
        String letter = "";
        for (char each: str.toCharArray()) {
            if (!(Character.isLetterOrDigit(each))){
                special+= each;
            }else if (Character.isDigit(each)){
                digit+=each;
            }else
            {
                letter+=each;
            }
        }
        System.out.println("letter = " + letter);
        System.out.println("digit = " + digit);
        System.out.println("special = " + special);



    }


}
