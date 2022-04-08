package day24_CustomReturnMethod;

public class frequencyOfWord {

    public static void main(String[] args) {

        String sentence = "Java Java Java phyton";
        int count = freq(sentence,"Java");
        System.out.println(count);



    }


    public static int freq (String sentence, String word){
        String [] sentenc = sentence.split(" ");
        int count =0;
        for (String s : sentenc) {
            if (s.equals(word))
                count++;
        }
        return count;
    }


}

/*
 //Given an array of integers, write a program that prints the index of an item
   //in the array, where the sum of all items on its left is equal to the sum
   //of the ones on the right.

   For example :
       Given array => [4, 9, 1, 3, 6, 4]
   //Output:
       your program should print as a result => 2
       because the item at index 2 is 1, and 4+9 = 3+6+4
 */
