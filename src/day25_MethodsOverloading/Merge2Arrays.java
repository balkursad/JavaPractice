package day25_MethodsOverloading;

import java.util.Arrays;

public class Merge2Arrays {

    public static void main(String[] args) {
        int[] integer1 = {1,2,3};
        int[] integer2 = {4,5,6};
        double[] integer3 = {1.5,2.5,3.5};
        double[] integer4 = {4.5,5.5,6.5};
        char[] char1 = { 'A','B'};
        char[] char2 = { 'c','D'};
        String[] str1 = {"anne", "baba", "kardes"};
        String[] str2 = {"cocuk", "amca", "dayi"};
        int[] merge = merge(integer1,integer2);
        System.out.println(Arrays.toString(merge));
        double[] merge1 = merge(integer3,integer4);
        System.out.println(Arrays.toString(merge1));
        char[] merge2 = merge(char1, char2);
        System.out.println(Arrays.toString(merge2));
        String[] merge3 = merge(str1,str2);
        System.out.println(Arrays.toString(merge3));


    }

    public static int[] merge(int [] nums1, int[] nums2){
        int[] result=new int[nums1.length+ nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i]=nums1[i];
        }
        for (int i = nums1.length,j=0; i < nums2.length+ nums1.length ;j++, i++) {
            result[i]=nums2[j];
        }
        return result;
    }

    public static double[] merge(double [] nums1, double[] nums2){
        double[] result=new double[nums1.length+ nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i]=nums1[i];
        }
        for (int i = nums1.length,j=0; i < nums2.length+ nums1.length ;j++, i++) {
            result[i]=nums2[j];
        }
        return result;
    }


    public static char[] merge(char [] char1, char[] char2){
        char[] result=new char[char1.length+ char2.length];
        for (int i = 0; i < char1.length; i++) {
            result[i]=char1[i];
        }
        for (int i = char1.length,j=0; i < char2.length+ char1.length ;j++, i++) {
            result[i]=char2[j];
        }
        return result;
    }

    public static String[] merge(String [] str1, String[] str2){
        String[] result=new String[str1.length+ str2.length];
        for (int i = 0; i < str1.length; i++) {
            result[i]=str1[i];
        }
        for (int i = str1.length,j=0; i < str2.length+ str1.length ;j++, i++) {
            result[i]=str2[j];
        }
        return result;
    }

}
