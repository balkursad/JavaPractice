package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class SwapFirstToLast {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5));

        ArrayList<Integer> swap = new ArrayList<>();

        for (int i = nums.size()-1; i >= 0; i--) {
            swap.add(nums.get(i));
        }
        System.out.println(swap);


    }
}
