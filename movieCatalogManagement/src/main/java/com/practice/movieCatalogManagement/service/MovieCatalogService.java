package com.practice.movieCatalogManagement.service;

import com.practice.movieCatalogManagement.dto.Movie;

import java.util.List;

public interface MovieCatalogService {
    List<Movie> getAllMovies();

    Movie getMovie(String id);
}
