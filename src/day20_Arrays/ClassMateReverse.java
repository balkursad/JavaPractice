package day20_Arrays;

public class ClassMateReverse {

    public static void main(String[] args) {

        String[] classMates = {"Hasan", "Nuri", "Selim", "Fatih", "Safa", "Adnan", "Akın", "Emre", "Ayse", "Fatma"};
        int j = 0;
        for (String classMate : classMates) {

            String reverse = "";
            for (int i =classMates[j].length()-1 ; i >=0 ; i--) {
                reverse+=""+classMate.charAt(i);

            }
            System.out.println(reverse);
            j++;
        }




    }
}
