package com.company;

import models.MovieRatingByUser;

import java.util.*;
import java.util.stream.Stream;

public class SortMovieRating {
    public ArrayList<MovieRatingByUser> SortData(HashMap<Integer, Double> averageGradeByMovie) {
        ArrayList<MovieRatingByUser> movieRatingList = new ArrayList<MovieRatingByUser>();
        for (Integer key :
                averageGradeByMovie.keySet()) {
            movieRatingList.add(new MovieRatingByUser(key, averageGradeByMovie.get(key)));
        }
        Collections.sort(movieRatingList, new Comparator<MovieRatingByUser>() {
            @Override
            public int compare(MovieRatingByUser o1, MovieRatingByUser o2) {
                return o1.GetRating().compareTo(o2.GetRating());
            }
        });

        ArrayList<MovieRatingByUser> tempList = new ArrayList<MovieRatingByUser>();
        for(var i = movieRatingList.size() - 1; i >= 0; i--){
            tempList.add(movieRatingList.get(i));
        }

        return tempList;
    }
}
