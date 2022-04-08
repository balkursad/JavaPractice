package day25_MethodsOverloading;

import java.util.Arrays;

public class ReturnMaxNumber {

    public static void main(String[] args) {
        int [] numbers = {2,5,8,-2,-5,-5};
        numbers=maxNumber(numbers);
        System.out.println(Arrays.toString(numbers));

        double[] numbers1 = {1.5,-1.5,3.5};
        numbers1 = maxNumber(numbers1);
        System.out.println(Arrays.toString(numbers1));

        long [] numbers2= {2,5,8,-2,-5,-5};
        numbers2=maxNumber(numbers2);
        System.out.println(Arrays.toString(numbers2));

        short[] numbers3 = {1,-1,3};
        numbers3 = maxNumber(numbers3);
        System.out.println(Arrays.toString(numbers3));




    }


    public static int[] maxNumber(int[] nums){
        int max = 0;

        for (int num : nums) {
            if (num>max){
                max = num;
            }

        }
        return new int[]{max};
    }


    public static double[] maxNumber(double[] nums){
        double max = 0;

        for (double num : nums) {
            if (num>max){
                max = num;
            }

        }
        return new double[]{max};
    }


    public static long[] maxNumber(long[] nums){
        long max = 0;

        for (long num : nums) {
            if (num>max){
                max = num;
            }

        }
        return new long[]{max};
    }
    public static short[] maxNumber(short[] nums){
        short max = 0;

        for (short num : nums) {
            if (num>max){
                max = num;
            }

        }
        return new short[]{max};
    }
    public static float[] maxNumber(float[] nums){
        float max = 0;

        for (float num : nums) {
            if (num>max){
                max = num;
            }

        }
        return new float[]{max};
    }
    public static byte[] maxNumber(byte[] nums){
        byte max = 0;

        for (byte num : nums) {
            if (num>max){
                max = num;
            }

        }
        return new byte[]{max};
    }

}
