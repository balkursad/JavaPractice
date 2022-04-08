package day9_IfElseStatement;

public class EqualNumber {
    public static void main(String[] args) {
        int a=8, b=8, c=12;
         if (a==b&&b==c){
             System.out.println("all equal");
         }else if (a==b&&b!=c){
             System.out.println("a&b are equal");
         }else if (a==c&&a!=b){
             System.out.println("a&c are equal");
         }else if (b==c&&c!=a){
             System.out.println("b&c are equal");
         }else{
             System.out.println("none of them are equal");
         }



    }
}
