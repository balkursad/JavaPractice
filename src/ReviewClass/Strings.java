package ReviewClass;

public class Strings {
    public static void main(String[] args) {

        String word = "musteri numarasi:1287  kart numarası:45698521";
        //müsteri no(4basamak)  ve kart noyu bulucaz(8 basamak)

        int result1 = word.indexOf(":");
        String musterino = word.substring(result1+1,result1+5);
        int result2 = word.indexOf(":", result1+1);
        String kartno = word.substring(result2+1, result2+9);

        System.out.println("musterino = " + musterino);
        System.out.println("kartno = " + kartno);

        String today = "I coded a lot of [Java] today";
        int a=today.indexOf("["),
                b=today.indexOf("]");
        String result = today.substring(a+1, b);
        System.out.println(result);





    }
}
