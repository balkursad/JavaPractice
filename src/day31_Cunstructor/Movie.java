package day31_Cunstructor;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {

    public String country, title, genre, releaseDate, director;
    public ArrayList<String> casts=new ArrayList<>();

    public Movie(String country, String title, String genre, String releaseDate, String director) {
        this.country = country;
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.director = director;
        this.casts = casts;
    }

    public void addCast(String name){
        casts.add(name);
    }

    public void addCasts(String[] names){
        casts.addAll(Arrays.asList(names));
    }


    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", totalNumberOfCasts=" + casts.size() +
                '}';
    }
}
