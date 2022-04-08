package day18NestedLoop;

public class UniqueCharacter {

    public static void main(String[] args) {

        String word = "aabccdeef";
        String result = "";
        String direction = "";
        for (int i = 0; i < word.length(); i++) {
            String ch = ""+ word.charAt(i);
            int freq =0;
            direction = ch;
            for (int j = 0; j < word.length(); j++) {
                if (direction.equals((""+word.charAt(j)))){
                    freq ++;
                }
            }

            if(freq==1){
                result +=direction;
            }





        }
        System.out.print(result);


    }
}
