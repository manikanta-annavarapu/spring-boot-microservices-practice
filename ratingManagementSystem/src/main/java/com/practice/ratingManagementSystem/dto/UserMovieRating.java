package com.practice.ratingManagementSystem.dto;

public class UserMovieRating {
    private User user;
    private Movie movie;
    private int rating;

    public UserMovieRating(User user, Movie movie, int rating) {
        this.user = user;
        this.movie = movie;
        this.rating = rating;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
