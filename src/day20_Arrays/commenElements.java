package day20_Arrays;

import java.util.Arrays;

public class commenElements {

    public static void main(String[] args) {

        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {4,5,6,7,8};
        int count = 0;
        for (int i1 : nums1) {
            for (int i2 : nums2) {
                if (i1==i2){
                    count++;
                }
            }
        }
        int[] result = new int[count];
        int i=0;
        for (int i1 : nums1) {
            for (int i2 : nums2) {

                if (i1==i2){
                    result[i]=i1;
                            i++;
                }
            }
        }
        System.out.println(Arrays.toString(result));


    }
}
