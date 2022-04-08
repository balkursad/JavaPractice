package day31_Cunstructor.Restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public String owner, location;
    public int numbersOfStars;
    ArrayList<Server>servers = new ArrayList<>();
    ArrayList<Chef> chefs = new ArrayList<>();

    public Restaurant(String owner, String location, int numbersOfStars) {
        this.owner = owner;
        this.location = location;
        this.numbersOfStars = numbersOfStars;
        this.servers = servers;
        this.chefs = chefs;
    }

    public void hireServer(Server name){
        servers.add(name);
    }

    public void hireServers(Server[] names){
        servers.addAll(Arrays.asList(names));
    }

    public void hireChef(Chef name){
        chefs.add(name);
    }

    public void hireChefs(Chef[] names){
        chefs.addAll(Arrays.asList(names));
    }

    public void terminateChef(int employeeID){
        chefs.removeIf(p-> p.employeeID==employeeID );
    }

    public void terminateServer(int employeeID){
        servers.removeIf(p-> p.employeeID==employeeID );
    }

    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numbersOfStars=" + numbersOfStars +
                ", servers=" + servers.size() +
                ", chefs=" + chefs.size() +
                '}';
    }
}
