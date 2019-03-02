package edu.microservices.springboot.movielist.service;

import edu.microservices.springboot.movielist.model.Movie;
import edu.microservices.springboot.movielist.repository.MovieListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    public MovieListRepository movieRepository;

    @Override
    public List<Movie> findByViewer(String viewer) {
        return movieRepository.findMovieByViewerEquals(StringUtils.trimWhitespace(viewer));
    }

    @Override
    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }
}
