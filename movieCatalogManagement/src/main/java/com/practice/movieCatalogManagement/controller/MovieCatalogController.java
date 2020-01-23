package com.practice.movieCatalogManagement.controller;

import com.practice.movieCatalogManagement.dto.Movie;
import com.practice.movieCatalogManagement.service.MovieCatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movies-catalog")
public class MovieCatalogController {
    @Autowired
    private MovieCatalogService movieCatalogService;

    @GetMapping("/movies")
    public List<Movie> getAllMovies(){
        return movieCatalogService.getAllMovies();
    }

    @GetMapping("/movie/{id}")
    public Movie getMovie(@PathVariable String id){
        return   movieCatalogService.getMovie(id);
    }
}
