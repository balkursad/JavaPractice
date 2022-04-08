package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxNumber {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5));
        int max = 0;
        for (Integer each : nums) {
            if (each>max){
                max=each;
            }
        }
        System.out.println(max);

    }
}
