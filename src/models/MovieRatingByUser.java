package models;

public class MovieRatingByUser {
    public int movieId;
    public double rating;

    public MovieRatingByUser(int movieId, double rating){
        this.movieId = movieId;
        this.rating = rating;
    }

    public Double GetRating(){
        return this.rating;
    }
}
