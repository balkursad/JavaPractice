package day21_EachLoop;

public class Palindrome {

    public static void main(String[] args) {
        String[] words={"anna", "level", "java", "kurs", "amma", "comar", "alla"};
        int j = 0;
        for (String word : words) {
            String equal = "";
            for (int i = word.length()-1; i >=0 ; i--) {
                char ch = word.charAt(i);
                equal+=""+ch;
            }
            if (equal.equals(word)){
               j++;
            }
        }
        System.out.println(j);



    }
}
