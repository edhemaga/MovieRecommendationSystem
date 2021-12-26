package mappers;

import models.MovieRatingByUser;
import models.Rating;

import java.util.ArrayList;
import java.util.HashMap;

public class UserMapper {
    public HashMap<Integer, ArrayList<MovieRatingByUser>> MapData(ArrayList<Rating> ratings) {
        HashMap<Integer, ArrayList<MovieRatingByUser>> userRating = new HashMap<Integer, ArrayList<MovieRatingByUser>>();
        for (Rating rating : ratings
        ) {
            int userId = rating.GetUserId();
            int movieId = rating.GetMovideId();
            double ratingGrade = rating.GetRating();

            if (!userRating.containsKey(userId)) {
                ArrayList<MovieRatingByUser> ratingsTemp = new ArrayList<MovieRatingByUser>();
                ratingsTemp.add(new MovieRatingByUser(movieId, ratingGrade));
                userRating.put(userId, ratingsTemp);
            } else {
                ArrayList<MovieRatingByUser> ratingsTemp = userRating.get(userId);
                ratingsTemp.add(new MovieRatingByUser(movieId, ratingGrade));
                userRating.put(userId, ratingsTemp);
            }
        }

        return userRating;
    }
}
