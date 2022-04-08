package day22_DimensionalArray;

public class StringItems {

    public static void main(String[] args) {

        String[][] items = { {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };
        for (String[] item : items) {
            for (String s : item) {
                System.out.print(s+"\t");
            }
            System.out.println();
        }
        System.out.println("---------------------");
        int x = 0, y= 0;
        for (int i = 0; i < items.length; i++) {
            for (int i1 = items[i].length - 1; i1 >= 0; i1--) {
                System.out.print(items[i][i1]+"\t");
                x++;
            }
            System.out.println();
            y++;
        }
        System.out.println("-------------------");
        int a=0, b=0;

        for (int i = items.length - 1; i >= 0; i--) {
            for (int i1 = 0; i1 < items[i].length; i1++) {
                System.out.print(items[i][i1]+"\t");
                b++;
            }
            a++;
            System.out.println();
        }




    }
}
