package day21_EachLoop;

public class EvenOrOdd {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7,8,9};

      /*  for (int num : nums) {
            if (num%2==0){
                System.out.println(num+" is even");
            }else{
                System.out.println(num+" is odd");
            }
        }

       */
        for (int num : nums) {
            if (num%2==0){
                System.out.print(num+" ");
            }
        }
        System.out.println();
        for (int num : nums) {
            if (num%2==1){
                System.out.print(num+" ");
            }
        }


    }
}
