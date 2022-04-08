package day27_Wrapping;

import java.util.Arrays;

public class insertNumber {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};
        numbers=insertnum(numbers,2,100);
        System.out.println(Arrays.toString(numbers));

        double[] numbers1 = {10.5, 20.5, 30.5, 40.5, 50.5};
        numbers1=insertnum(numbers1,4,100.5);
        System.out.println(Arrays.toString(numbers1));



    }

    public static int[] insertnum(int[] arr, int index, int insert){
        int [] inserted = new int[arr.length+1];
        for (int i = 0, j=0; i <= index;j++, i++) {
           if (i!=index){
               inserted[i]= arr[j];
           }else
               inserted[i]=insert;
        }
        for (int i = index+1; i <= arr.length ; i++) {
            inserted[i]=arr[i-1];
        }
        return inserted;
    }

    public static double[] insertnum(double[] arr, int index, double insert){
        double [] inserted = new double[arr.length+1];
        for (int i = 0, j=0; i <= index;j++, i++) {
            if (i!=index){
                inserted[i]= arr[j];
            }else
                inserted[i]=insert;
        }
        for (int i = index+1; i <= arr.length ; i++) {
            inserted[i]=arr[i-1];
        }
        return inserted;
    }

    public static char[] insertnum(char[] arr, int index, char insert){
        char [] inserted = new char[arr.length+1];
        for (int i = 0, j=0; i <= index;j++, i++) {
            if (i!=index){
                inserted[i]= arr[j];
            }else
                inserted[i]=insert;
        }
        for (int i = index+1; i <= arr.length ; i++) {
            inserted[i]=arr[i-1];
        }
        return inserted;
    }

    public static String[] insertnum(String[] arr, int index, String insert){
        String [] inserted = new String[arr.length+1];
        for (int i = 0, j=0; i <= index;j++, i++) {
            if (i!=index){
                inserted[i]= arr[j];
            }else
                inserted[i]=insert;
        }
        for (int i = index+1; i <= arr.length ; i++) {
            inserted[i]=arr[i-1];
        }
        return inserted;
    }

}
