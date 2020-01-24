package com.practice.ratingManagementSystem.controller;

import com.practice.ratingManagementSystem.dto.Rating;
import com.practice.ratingManagementSystem.dto.UserMovieRating;
import com.practice.ratingManagementSystem.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {
    @Autowired
    private RatingService ratingService;

    @GetMapping("/movie/{movieId}")
    public List<UserMovieRating> getRatingsByMovie(@PathVariable String movieId){
        return ratingService.getRatingsByMovie(movieId);
    }

    @GetMapping("/all")
    public List<Rating> getAllRatings(){
        return ratingService.getAllRatings();
    }


}
