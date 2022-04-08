package day20_Arrays;

import java.util.Arrays;

public class ReversedInteger {

    public static void main(String[] args) {

        int numbers[] = {1,2,3,4,5};
        int reversed[] =new int[numbers.length];
        for (int i = numbers.length-1, j=0; i >=0 ;j++, i--) {
            reversed[j]= numbers[i];
        }
        System.out.println(Arrays.toString(reversed));



    }
}
