package day8_IfStatement;

public class eligibleToBuyCigara {
    public static void main(String[] args) {
        byte age = 15;

        boolean canBuyCigarette = age>=18;
        boolean cannotBuy = age<18;

        if (canBuyCigarette){
            System.out.println("Stecken Sie bitte 5€");
        }
        if (cannotBuy){
            System.out.println("Rauchen wird getötet.");
        }
    }




}
