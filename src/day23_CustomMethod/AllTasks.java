package day23_CustomMethod;

public class AllTasks {

    public static void main(String[] args) {

        Oddnumbers();
        System.out.println();
        EvenNumber();
        System.out.println();
        EligibleToBuyAlcohol(20);
        EligibleToVoid(25,"USA");



    }

    public static void Oddnumbers(){
        for (int i = 0; i < 100; i++) {
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }
    }

    public static void EvenNumber(){
        for (int i = 1; i < 101; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
    }

    public static void EligibleToBuyAlcohol(int number){
        if (number<=18){
            System.out.println("Not eligible");
        }else
            System.out.println("Eligible");

    }

    public static void EligibleToVoid(int number, String nation){
        if (number>18 && nation.equalsIgnoreCase("usa")){
            System.out.println("Eligible");
        }else
            System.out.println("not eligible");
    }


}
