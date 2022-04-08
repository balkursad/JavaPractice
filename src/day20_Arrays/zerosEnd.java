package day20_Arrays;

import java.util.Arrays;

public class zerosEnd {


    public static void main(String[] args) {

        int[] numbers = {10,0,5,0,1,0};
        int[] number = new int[numbers.length];
        for (int i = 0, j=0; i < numbers.length; i++) {
            if (numbers[i]!=0){
                number[j]=numbers[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(number));


    }
}
