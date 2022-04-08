package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MinNumber {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5));
        int min = nums.get(0);
        for (Integer each : nums) {
            if (min>each){
                min=each;
            }
        }

        System.out.println(min);
    }
}
