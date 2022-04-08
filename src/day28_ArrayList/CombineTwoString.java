package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoString {

    public static void main(String[] args) {

        ArrayList<Character> arr1= new ArrayList<>();
        arr1.addAll(Arrays.asList('A','B','C'));
        ArrayList<Character> arr2= new ArrayList<>();
        arr2.addAll(Arrays.asList('D','E','F','G'));
        ArrayList<Character> list= new ArrayList<>();

        for (int i = 0; i < arr1.size(); i++) {
            list.add(arr1.get(i));
        }
        for (int i = 0; i < arr2.size(); i++) {
            list.add(arr2.get(i));
        }
        System.out.println(list);

    }
}
