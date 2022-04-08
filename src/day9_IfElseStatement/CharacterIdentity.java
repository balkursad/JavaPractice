package day9_IfElseStatement;

public class CharacterIdentity {
    public static void main(String[] args) {
        char identity = '2';

        if(identity<=90&&identity>=65){
            System.out.println("greater case");
        }else if (identity>=97&&identity<=122){
            System.out.println("smaller case");
        }else if (identity>=48&&identity<=57){
            System.out.println("number");
        }else{
            System.out.println("special character");
        }



    }
}
