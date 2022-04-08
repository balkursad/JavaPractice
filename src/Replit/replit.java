package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class replit {

    public static String lameDb(String db, String op, String id, String data) {

        String[] arr = db.split("#");


        int index = Integer.parseInt(id)-1;
        String currentResult="";
        if (op.equals("add")){
            String [] result = new String[arr.length+1];
            if (index != 0) {
                result[index] =   id + data;
            }else{
                result [index] = id+data;
            }
            for (int i = 0, j=0; i <= arr.length;j++, i++) {
                if (i==index){
                    j=j-1;
                    continue;
                }
                result[i]=arr[j];
            }

            int m=1;
            String[] direction = new String[arr.length+1];

            for (int i = 0; i < arr.length; i++) {
                String t = m+"";
                for (int j = 0, k=1; j < 2;k++, j++) {

                    if (Character.isDigit(result[i].charAt(j))){
                     direction[i]=result[i].replace(arr[i].charAt(j)+"",t);


                    }
                }
                m++;
            }

            for (String s : direction) {
                currentResult+=s+"#";
            }


        }else if (op.equals("edit")){
            String [] result = new String[arr.length];
            if (index != 0) {
                result[index] = "#" + id + data;
            }else{
                result [index] = id+data+"#";
            }

            for (int i = 0, j=0; i < arr.length;j++, i++) {
                if (i==index){
                    j=j-1;
                    continue;
                }
                result[i]=arr[j];
                for (String s : result) {
                    currentResult+=s;
                }

            }

        }else{

        }










        return currentResult;
    }//end lameDb

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(lameDb(in.next(), in.next(), in.next(), in.next()));

    }
}
