package day21_EachLoop;

import java.util.Arrays;

public class desendingNumber {


    public static void main(String[] args) {

        int[] nums = {5,8,10,15,41,2,12};
        Arrays.sort(nums);

        int[] result = new int[nums.length];
        for (int i = nums.length-1, j=0; i >=0; i--, j++) {
        result[j]=nums[i];

        }
        System.out.println(Arrays.toString(result));




    }
}
