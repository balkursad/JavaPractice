package day22_DimensionalArray;

import java.util.Arrays;

public class ReverseTwoDimensional {

    public static void main(String[] args) {

        int[][] arr = {{1,2,3},{4,5,6}};
        int a=0;
        int b=0;
        int[][] result = new int[2][3];
        for (int i = arr.length - 1; i >= 0; i--) {
                b=0;
            for (int i1 = arr[i].length - 1; i1 >= 0; i1--) {
               result[a][b]= arr[i][i1];
               b++;
            }
            a++;
        }

        System.out.println(Arrays.deepToString(result));


    }
}
