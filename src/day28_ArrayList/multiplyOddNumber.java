package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class multiplyOddNumber {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer each : nums) {
            if (each%2!=0) {
                result.add(each*2);
            } else{
                result.add(each);
            }
        }
        System.out.println(result);


    }
}
