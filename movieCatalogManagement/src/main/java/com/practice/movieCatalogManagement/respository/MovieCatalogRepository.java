package com.practice.movieCatalogManagement.respository;

import com.practice.movieCatalogManagement.dto.Movie;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class MovieCatalogRepository {
    private List<Movie> moviesList ;

    public MovieCatalogRepository() {
        this.moviesList = new ArrayList<Movie>();
        this.moviesList.add(new Movie("a","Dhoom","Robbery"));
        this.moviesList.add(new Movie("b","Bahubali","epic movie"));
    }

    public List<Movie> getAllMovies() {
        return this.moviesList;
    }

    public Movie getMovie(String id){
        Optional<Movie> movie = this.moviesList.stream().filter(m -> m.getMovieId().equals(id)).findFirst();
        if(movie.isPresent()){
            return movie.get();
        }
        else{
            return new Movie();
        }
    }
}
