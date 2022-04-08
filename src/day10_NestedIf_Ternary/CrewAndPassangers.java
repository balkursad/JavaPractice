package day10_NestedIf_Ternary;

public class CrewAndPassangers {
    public static void main(String[] args) {
        int number = 50;
        String result = "";

        if(number==50||number==100||number==75){

            if(number==50){
                result = "20 crew, 30 passengers";
            }else if(number ==75){
                result = "25 crew, 50 passengers";
            }else {
                result = "30 crew, 70 passengers";
            }


        }else{
            result = "Invalid number";
        }
        System.out.println(result);




    }

}
