package com.practice.ratingManagementSystem.repository;

import com.practice.ratingManagementSystem.dto.Movie;
import com.practice.ratingManagementSystem.dto.Rating;
import com.practice.ratingManagementSystem.dto.User;
import com.practice.ratingManagementSystem.dto.UserMovieRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Repository
public class RatingRepository {

    private List<Rating> ratingList;

    @Autowired
    private RestTemplate restTemplate;

    public RatingRepository() {
        ratingList = new ArrayList<Rating>();
        ratingList.add(new Rating(1,"a",4));
        ratingList.add(new Rating(1,"b",3));
        ratingList.add(new Rating(2,"a",5));
        ratingList.add(new Rating(3,"a",4));
        ratingList.add(new Rating(2,"b",3));
        ratingList.add(new Rating(4,"b",4));
    }

    public List<UserMovieRating> getRatingsByMovie(String id){
        List<UserMovieRating> list = new ArrayList<UserMovieRating>();
        Stream<Rating> ratingStream = ratingList.stream().filter(rating -> rating.getMovieId().equals(id));
        ratingStream.forEach(rating -> {
                User user = restTemplate.getForObject("http://localhost:8088/user/" + rating.getUserId(), User.class);
                Movie movie = restTemplate.getForObject("http://localhost:8080/movies-catalog/movie/" + rating.getMovieId(), Movie.class);
                list.add(new UserMovieRating(user, movie, rating.getRating()));
        });
        return list;
    }

    public List<Rating> getAllRatings() {
        return ratingList;
    }
}
