package day21_EachLoop;

import java.util.Arrays;

public class CommonElement {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[]  arr2 ={4,5,6,7,8};

        int count = 0;
        for (int i : arr1) {
            for (int i1 : arr2) {
                if (i==i1){
                    count++;
                }
            }

        }
        int[] result = new int[count];
        int j = 0;
        for (int i : arr1) {
            for (int i1 : arr2) {
                if (i==i1){
                    result[j]=i;
                    j++;
                }
            }
        }
        System.out.println(Arrays.toString(result));

    }
}
