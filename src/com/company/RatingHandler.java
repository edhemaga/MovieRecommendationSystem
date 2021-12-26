package com.company;

import models.Movie;
import models.Rating;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class RatingHandler {
    String pathToCsv = "D:/Projekti/MovieRecommendationSystem/Data/ratings.csv";

    public ArrayList<Rating> GetData() {
        ArrayList<Rating> ratings = new ArrayList<Rating>();
        int cnt = 0;
        try {
            BufferedReader csvReader = new BufferedReader(new FileReader(pathToCsv));
            String row;
            while ((row = csvReader.readLine()) != null) {
                if (cnt != 0) {
                    String[] data = row.split(",");
                    Rating rating = new Rating(Integer.parseInt(data[0]), Integer.parseInt(data[1]), Double.parseDouble(data[2]));
                    ratings.add(rating);
                }
                cnt++;
            }
            csvReader.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return ratings;
    }
}


