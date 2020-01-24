package com.practice.ratingManagementSystem.service;

import com.practice.ratingManagementSystem.dto.Rating;
import com.practice.ratingManagementSystem.dto.UserMovieRating;
import com.practice.ratingManagementSystem.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {
    @Autowired
    private RatingRepository ratingRepository;

    public RatingServiceImpl(){}

    @Override
    public List<UserMovieRating> getRatingsByMovie(String movieId) {
        System.out.println("Inside service /// "+movieId);
        return ratingRepository.getRatingsByMovie(movieId);
    }

    @Override
    public List<Rating> getAllRatings() {
        return ratingRepository.getAllRatings();
    }
}
