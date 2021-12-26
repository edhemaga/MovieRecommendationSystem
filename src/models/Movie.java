package models;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    public int movieId;
    public String title;
    public ArrayList<String> generes;

    public Movie(int movieId, String title, ArrayList<String> genres) {
        this.movieId = movieId;
        this.title = title;
        this.generes = genres;
    }
}
