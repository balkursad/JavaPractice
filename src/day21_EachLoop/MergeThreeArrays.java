package day21_EachLoop;

import java.util.Arrays;

public class MergeThreeArrays {

    public static void main(String[] args) {

        int[] arr1 = {30,10,20};
        int[] arr2 = {15,40,25,35};
        int[] arr3 = {8,9,17,5,4,1};

        int[] result = new int[arr1.length+arr2.length+ arr3.length];

        for (int i = 0; i < arr1.length; i++) {
            result[i]=arr1[i];
        }
        for (int i = arr1.length, j=0; i <arr1.length+arr2.length ;j++, i++) {
            result[i]=arr2[j];
        }
        for (int i = arr1.length+arr2.length, j=0; i<arr1.length+arr2.length+ arr3.length; j++,i++){
            result[i]=arr3[j];
        }
        System.out.println(Arrays.toString(result));
    }
}
