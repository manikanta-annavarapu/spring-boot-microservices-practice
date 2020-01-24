package com.practice.ratingManagementSystem.service;

import com.practice.ratingManagementSystem.dto.Rating;
import com.practice.ratingManagementSystem.dto.UserMovieRating;

import java.util.List;

public interface RatingService {
    List<UserMovieRating> getRatingsByMovie(String movieId);

    List<Rating> getAllRatings();
}
