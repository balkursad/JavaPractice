package day20_Arrays;

public class Items {

    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        //1. find out the first index number of "Gloves"

        int index = 0;
        for (String item : items) {
            if (item.equalsIgnoreCase("gloves")){
                System.out.println(index);
            }
            index++;
        }
        //2. find out if "iPad" is contained in the item list
        for (String item : items) {
            if (item.equalsIgnoreCase("iPad")){
                System.out.println("iPad is included in Items");
            }
        }

        //Print the report of each shopping item
        //            name - price - #ID


        for (int i = 0; i < items.length; i++) {
            String item = items[i];
            double price = prices[i];
            int ids = itemIDs[i];
            System.out.println(item+" - "+price+" - "+ids);
        }


    }
}
