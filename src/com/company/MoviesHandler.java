package com.company;

import models.Movie;

import java.io.*;
import java.util.ArrayList;

public class MoviesHandler {
    String pathToCsv = "D:/Projekti/MovieRecommendationSystem/Data/movies.csv";

    public ArrayList<Movie> GetData() {
        ArrayList<Movie> movies = new ArrayList<Movie>();
        int cnt = 0;
        try {
            BufferedReader csvReader = new BufferedReader(new FileReader(pathToCsv));
            String row;
            while ((row = csvReader.readLine()) != null) {
                if (cnt != 0) {
                    String[] data = row.split(",");
                    ArrayList<String> genres = new ArrayList<String>();
                    String genresTemp[] = data[2].split("\\|");
                    for (String genreTemp : genresTemp
                    ) {
                        genres.add(genreTemp);
                    }
                    Movie movie = new Movie(Integer.parseInt(data[0]), data[1], genres);
                    movies.add(movie);
                }
                cnt++;
            }
            csvReader.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return movies;
    }
}

