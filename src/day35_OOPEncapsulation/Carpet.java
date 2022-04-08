package day35_OOPEncapsulation;

public class Carpet {

    private double width;
    private double length;
    private double unitPrice;
    private boolean isPersian;

    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
    public double getUnitPrice(){
        return unitPrice;
    }

    public void setWidth(double width){
        if (width<=0){
            return;
        }
        this.width=width;
    }
    public void setLength(double length){
        if (length<=0){
            return;
        }
        this.length=length;
    }
    public void setUnitPrice(double unitPrice){
        if (unitPrice<=0){
            return;
        }
        this.unitPrice=unitPrice;
    }
    public void setPersian(boolean isPersian){
        this.isPersian=isPersian;
    }

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
       setWidth(width);
        setLength(length);
        setUnitPrice(unitPrice);
        setPersian(isPersian);
    }

    public double calcCost(){
        double cost= unitPrice*width*length;
        if (isPersian){
            cost+=200;
        }
        return cost;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", total cost" + calcCost() +
                '}';
    }
}
