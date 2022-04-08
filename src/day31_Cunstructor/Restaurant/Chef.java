package day31_Cunstructor.Restaurant;

public class Chef {

    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean isFullTime;

    public Chef(String name, int employeeID, double hourlyRate, boolean isFullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.isFullTime = isFullTime;
    }

    public void makeOrder(){
        System.out.println(name+" is making an order");
    }

    public void washDishes(){
        System.out.println(name+ " is washing the dishes");
    }

    public String toString() {
        String fulltime = (isFullTime==true)? "Full-time" : "Part- time";
        return "chef{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", isFullTime=" + fulltime +
                '}';
    }
}
