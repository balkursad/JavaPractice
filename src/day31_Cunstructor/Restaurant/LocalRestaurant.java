package day31_Cunstructor.Restaurant;

public class LocalRestaurant {

    public static void main(String[] args) {

        Restaurant object1 = new Restaurant("Kursad", "Ingelheim",4);
        Chef chef = new Chef("Hasan", 23,35,true);
        Server server = new Server("Mahmut", 22, 25, false);

        object1.hireChef(chef);
        object1.hireServer(server);

        System.out.println(object1);
        System.out.println(chef);
        System.out.println(server);




    }
}
