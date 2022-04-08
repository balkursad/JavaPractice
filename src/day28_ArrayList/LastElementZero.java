package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class LastElementZero {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5));

        nums.set(nums.size()-1, 0);
        System.out.println(nums);

    }
}
