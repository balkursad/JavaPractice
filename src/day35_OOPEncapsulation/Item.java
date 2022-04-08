package day35_OOPEncapsulation;

public class Item {

    private String name;
    private double unitPrice;
    private int quantitiy;

    public Item(String name, double unitPrice, int quantitiy) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantitiy(quantitiy);
    }

    public String getName(){
        return name;
    }

    public double getUnitPrice(){
        return unitPrice;
    }

    public int getQuantitiy(){
        return quantitiy;
    }

    public void setName(String name){
        if (name.isEmpty()||name.isBlank()){
            return;
        }
        for (int i = 0; i < name.length(); i++) {
            if (!(Character.isLetterOrDigit(name.charAt(i)))){
                if (name.charAt(i)==' '){
                    continue;
                }else{
                    return;
                }
            }
            if (!(Character.isLetter(0))){
                return;
            }
            this.name = name;
        }
    }

    public void setUnitPrice(double unitPrice){
        if (unitPrice<0){
            return;
        }
        this.unitPrice = unitPrice;
    }

    public void setQuantitiy(int quantitiy){
        if(quantitiy<0){
            return;
        }
        this.quantitiy = quantitiy;
    }

    public double calccost(){
        double total = quantitiy*unitPrice;
        return total;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantitiy=" + quantitiy +
                '}';
    }
}
