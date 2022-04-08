package day18NestedLoop;

public class frequencyOfCharacter {

    public static void main(String[] args) {
        int number = 0;
        String result ="";
        String direction = "";
        String word = "aabcccd";
        for (int i = 0; i < word.length(); i++) {
            String ch = ""+ word.charAt(i);
            if (direction.equals(ch)){
                continue;
            }
            direction = ch;
            number=0;
            for (int j = 0; j <word.length() ; j++) {
                if((""+word.charAt(j)).equals(ch)){
                    number++;
                }


            }
            result += ch+number;

        }
        System.out.println(result);

    }
}
