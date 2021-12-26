package models;

public class Rating {
    private int userId;
    private int movieId;
    private double rating;

    public Rating(int userId, int movieId, double rating){
        this.userId = userId;
        this.movieId = movieId;
        this.rating = rating;
    }

    public int GetUserId(){
        return this.userId;
    }

    public int GetMovideId(){
        return this.movieId;
    }

    public double GetRating(){
        return this.rating;
    }
}
