package day25_MethodsOverloading;

import java.util.Arrays;

public class reverse {

    public static void main(String[] args) {

        int[] n1 = {1,2,3,4,5,6};
        n1=reverse(n1);
        System.out.println(Arrays.toString(n1));

        double[] n2={1.1,1.2,2.2,2.5};
        n2=reverse(n2);
        System.out.println(Arrays.toString(n2));

        char[] ch = { 'a', 'k', 'o', 'z'};
        ch= reverse(ch);
        System.out.println(Arrays.toString(ch));

        String [] str = {"Kaya", "at", "topu", "at"};
        str=reverse(str);
        System.out.println(Arrays.toString(str));



    }

    public static int[] reverse(int[]nums){
        int[] rev = new int[nums.length];

        for (int i = nums.length-1, j=0 ; i >=0 ;j++, i--) {
            rev[j] = nums[i];
        }
        return rev;
    }

    public static double[] reverse(double[]nums){
        double[] rev = new double[nums.length];

        for (int i = nums.length-1, j=0 ; i >=0 ;j++, i--) {
            rev[j] = nums[i];
        }
        return rev;
    }

    public static char[] reverse(char[]nums){
        char[] rev = new char[nums.length];

        for (int i = nums.length-1, j=0 ; i >=0 ;j++, i--) {
            rev[j] = nums[i];
        }
        return rev;
    }

    public static String[] reverse(String[]nums){
        String[] rev = new String[nums.length];

        for (int i = nums.length-1, j=0 ; i >=0 ;j++, i--) {
            rev[j] = nums[i];
        }
        return rev;
    }



}
