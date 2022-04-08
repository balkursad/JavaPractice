package day11_SwitchUndScanner;

public class GradeLevel {
    public static void main(String[] args) {
        byte number= 22;

        switch (number){
            case 1: case 2: case 3: case 4 : case 5:
                System.out.println("Elementery School");
                break;
                case 6:case 7 : case 8:
                System.out.println("Middle School");
                break;
            case 9 : case 10 : case 11 : case 12:
                System.out.println("High School");
                break;
            case 13: case 14 : case 15 : case 16:
                System.out.println("Collage");
                break;
            case 17: case 18:
                System.out.println("Grad School");
                break;
            default:
                System.out.println("Invalid");
        }
        if (number>0 && number<19){
            switch (number) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("Elementery School");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Middle School");
                    break;
                case 9:
                case 10:
                case 11:
                case 12:
                    System.out.println("High School");
                    break;
                case 13:
                case 14:
                case 15:
                case 16:
                    System.out.println("Collage");
                    break;
                default:
                    System.out.println("Grad School");
            }

        }else{
            System.out.println("invalid");
        }


    }


}
