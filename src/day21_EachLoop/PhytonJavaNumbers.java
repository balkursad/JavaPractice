package day21_EachLoop;

import java.util.Arrays;

public class PhytonJavaNumbers {

    public static void main(String[] args) {

        String sentence = "java java python python java python";
        String[] word = sentence.split(" ");
        int i=0, j=0;
        for (String s : word) {
            if (s.equals("java")){
                i++;
            }
        }
        for (String s : word) {
            if (s.equals("python")){
                j++;
            }
        }
        System.out.println("Java amount:"+i+"\nPython amount:"+j);


    }
}
