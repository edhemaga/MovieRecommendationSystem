package com.company;

import mappers.MovieMapper;
import mappers.UserMapper;
import models.Movie;
import models.MovieRatingByUser;
import models.Rating;
import reducers.MovieRatingReducer;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        MoviesHandler moviesHandler = new MoviesHandler();
        RatingHandler ratingHandler = new RatingHandler();

        ArrayList<Movie> movies = moviesHandler.GetData();
        ArrayList<Rating> ratings = ratingHandler.GetData();

        UserMapper userMapper = new UserMapper();
        HashMap<Integer, ArrayList<MovieRatingByUser>> userMovieMap = userMapper.MapData(ratings);

        MovieMapper movieMapper = new MovieMapper();
        HashMap<Integer, ArrayList<Double>> movieRatingMap = movieMapper.MapData(ratings);

        MovieRatingReducer movieRatingReducer = new MovieRatingReducer();
        HashMap<Integer, Double> averageGradeByMovie = movieRatingReducer.ReduceData(movieRatingMap);

        SortMovieRating sortMovieRating = new SortMovieRating();
        var sortedMovieRatingList = sortMovieRating.SortData(averageGradeByMovie);

        for (MovieRatingByUser sortedMovieRating:
                sortedMovieRatingList) {
            System.out.println(sortedMovieRating.movieId + " " + sortedMovieRating.rating);
        }
    }
}


