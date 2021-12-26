package mappers;

import models.MovieRatingByUser;
import models.Rating;

import java.util.ArrayList;
import java.util.HashMap;

public class MovieMapper {
    public HashMap<Integer, ArrayList<Double>> MapData(ArrayList<Rating> ratings) {
        HashMap<Integer, ArrayList<Double>> movieRating = new HashMap<Integer, ArrayList<Double>>();
        for (
                Rating rating : ratings
        ) {
            int movieId = rating.GetMovideId();
            double ratingGrade = rating.GetRating();
            if (!movieRating.containsKey(movieId)) {
                ArrayList<Double> ratingsTemp = new ArrayList<Double>();
                ratingsTemp.add(ratingGrade);
                movieRating.put(movieId, ratingsTemp);
            } else {
                ArrayList<Double> ratingsTemp = movieRating.get(movieId);
                ratingsTemp.add(ratingGrade);
                movieRating.put(movieId, ratingsTemp);
            }

        }

        return movieRating;
    }
}
