package com.practice.movieCatalogManagement.service;

import com.practice.movieCatalogManagement.dto.Movie;
import com.practice.movieCatalogManagement.respository.MovieCatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieCatalogServiceImpl implements MovieCatalogService  {

    @Autowired
    private MovieCatalogRepository movieCatalogRepository;
    public MovieCatalogServiceImpl() {
    }

    @Override
    public List<Movie> getAllMovies() {
        return movieCatalogRepository.getAllMovies();
    }

    @Override
    public Movie getMovie(String id) {
        return movieCatalogRepository.getMovie(id);
    }
}
