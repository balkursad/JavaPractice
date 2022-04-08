package day27_Wrapping;

import java.util.Arrays;

public class Swap {

    public static void main(String[] args) {

        int [] arr= {1,2,3,4,5,6};
        arr=swap(arr,1,5);
        System.out.println(Arrays.toString(arr));



    }

    public static int[] swap(int[] arr, int num1, int num2){
        int[] result= new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i]=arr[i];

        }
        result[num1]=arr[num2];
        result[num2]=arr[num1];
        return result;
    }

    public static double[] swap(double[] arr, int num1, int num2){
        double[] result= new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i]=arr[i];

        }
        result[num1]=arr[num2];
        result[num2]=arr[num1];
        return result;
    }

    public static char[] swap(char[] arr, int num1, int num2){
        char[] result= new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i]=arr[i];

        }
        result[num1]=arr[num2];
        result[num2]=arr[num1];
        return result;
    }

    public static String[] swap(String[] arr, int num1, int num2){
        String[] result= new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i]=arr[i];

        }
        result[num1]=arr[num2];
        result[num2]=arr[num1];
        return result;
    }
    
}
