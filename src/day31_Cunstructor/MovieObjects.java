package day31_Cunstructor;

import java.util.ArrayList;

public class MovieObjects {

    public static void main(String[] args) {

        Movie movie1 = new Movie("USA", "Journey to SDET", "Adventure, Comedy, Thriller", "10/25/2021", "Kuzzat Altay");
        String[] casts = {"Asiya", "Adam"};
        movie1.addCasts(casts);
        movie1.addCast("Kursad");

        System.out.println(movie1);

    }
}
