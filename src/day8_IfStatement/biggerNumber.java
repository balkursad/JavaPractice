package day8_IfStatement;

public class biggerNumber {
    public static void main(String[] args) {
        int n1 = 200,
                n2 = 200;

        if (n1>n2){
            System.out.println(n1+" is maximum number.");
        }
        if (n2>n1){
            System.out.println(n2+ " is maximum number.");
        }
        if (n1==n2){
            System.out.println("Both of them ara equal.");
        }
        System.out.println("---------------------");

        int a=13, b=15, c= 14;
       // boolean small = c>b>a; uclu yapmiyor.

        if (a>b&&b>a||c>b&&b>a){
            System.out.println(b+" is the median number.");
        }
        if (b>a&&a>c||c>a&&a>b){
            System.out.println(a+" is the median number");
        }
        /*if (b>c&&c>a||a>c&&c>b){
            System.out.println(c+" is the median number");
        }

         */
        if (!(b>a&&a>c||c>a&&a>b)&&!(a>b&&b>a||c>b&&b>a)){  //unlem koymak suretiyle digerlerinin tersini aldim.
            System.out.println(c+" is the median number");
        }









    }
}
