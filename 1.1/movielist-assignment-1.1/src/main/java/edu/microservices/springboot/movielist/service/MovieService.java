package edu.microservices.springboot.movielist.service;

import edu.microservices.springboot.movielist.model.Movie;


import java.util.List;

public interface MovieService {

    List<Movie> findByViewer(String viewer);

    Movie saveMovie(Movie movie);

}
