package day11_SwitchUndScanner;

import java.util.Scanner;

public class CydeoBatches {
    public static void main(String[] args) {
        //1.solution
        String BatchType = "evening";
        if (BatchType.equals("evening")||BatchType.equals("morning")||BatchType.equals("EU")){
            if (BatchType.equals("evening")) {
                System.out.println("\"Class times are 7-10 EST. M, T, W, Th, S, S\"");
            }else if (BatchType.equals("morning")){
                System.out.println("\"Class times are 10-5 EST. M, T, Th, F.\"");
            }else{
                System.out.println("\"Class times are  10-5 EST. M, T, W, Th, F.\"");
            }

        }else{
            System.out.println("Invalid Batch");
        }

        //2.solution
        String BatchType2 = "morning";
        switch (BatchType2){
            case "morning":
                System.out.println("\"Class times are 10-5 EST. M, T, Th, F.\"");
                break;
            case "evening":
                System.out.println("\"Class times are 10-5 EST. M, T, Th, F.\"");
                break;
            case "EU":
                System.out.println("\"Class times are  10-5 EST. M, T, W, Th, F.\"");
                break;
            default:
                System.out.println("Invalid Batch");
        }

        //3.Solution
        String BatchTypes3 = "EU";
        if (BatchTypes3=="evening"||BatchTypes3=="morning"||BatchTypes3=="EU"){
            switch (BatchTypes3) {
                case "morning":
                    System.out.println("\"Class times are 10-5 EST. M, T, Th, F.\"");
                    break;
                case "evening":
                    System.out.println("\"Class times are 10-5 EST. M, T, Th, F.\"");
                    break;
                default:
                    System.out.println("\"Class times are  10-5 EST. M, T, W, Th, F.\"");
            }

        }else {
            System.out.println("Invalid Batch");
        }
        //solution 4
        Scanner scan = new Scanner(System.in);
        String BatchTypes4 = scan.nextLine();

        if (BatchTypes4.equals("evening")||BatchTypes4.equals("morning")||BatchTypes4.equals("EU")){
            switch (BatchTypes4) {
                case "morning":
                    System.out.println("\"Class times are 10-5 EST. M, T, Th, F.\"");
                    break;
                case "evening":
                    System.out.println("\"Class times are 10-5 EST. M, T, Th, F.\"");
                    break;
                default:
                    System.out.println("\"Class times are  10-5 EST. M, T, W, Th, F.\"");
            }

        }else {
            System.out.println("Invalid Batch");
        }



    }


}
/*4. Create a class named Cydeo batches. In Cydeo we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.

        	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "Invalid Btach"

        	Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed

 */
