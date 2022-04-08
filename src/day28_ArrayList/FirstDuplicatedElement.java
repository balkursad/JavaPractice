package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstDuplicatedElement {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,2,3,4,4,5,6,7,7));
        for (int i = 0; i < nums.size(); i++) {
            if (!(nums.indexOf(i)==nums.lastIndexOf(i))){
                System.out.println(nums.get(i));
                break;
            }

        }


    }
}
