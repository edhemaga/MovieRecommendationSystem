package reducers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class MovieRatingReducer {
    public HashMap<Integer, Double> ReduceData(HashMap<Integer, ArrayList<Double>> movieRatingMap) {
        HashMap<Integer, Double> movieAverageRating = new HashMap<Integer, Double>();
        for (Integer key :
                movieRatingMap.keySet()) {
            Double ratingSum = 0.0;
            for (Double grade : movieRatingMap.get(key)) {
                ratingSum += grade;
            }
            movieAverageRating.put(key, ratingSum/movieRatingMap.get(key).size());
        }
        return movieAverageRating;
    }
}
