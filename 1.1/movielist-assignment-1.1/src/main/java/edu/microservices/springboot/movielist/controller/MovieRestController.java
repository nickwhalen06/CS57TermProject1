package edu.microservices.springboot.movielist.controller;

import edu.microservices.springboot.movielist.model.Movie;
import edu.microservices.springboot.movielist.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieRestController {

    @Autowired
    private MovieService movieService;

    /*
     * Using @RequestParam
     */
    @RequestMapping(value = "/attributes", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Movie>> getMoviesByViewer(@RequestParam(value = "viewer", required = true) String viewer) {
        List<Movie> movies = movieService.findByViewer(viewer);
        if (movies.isEmpty()) {
            return new ResponseEntity<List<Movie>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Movie>>(movies, HttpStatus.OK);
    }

    /*
     * Example PUT
     */
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> updateMovie(@RequestBody Movie movie) {
        System.out.println("Updating movie with: " + movie);
        // STUB service method to update movie
        return new ResponseEntity<Movie>(movie, HttpStatus.OK);
    }

    /*
     * Example POST
     */
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> addNewMovie(@RequestBody Movie movie) {
        System.out.println("Creating movie with: " + movie);
        //movie.setDescription(movie.getDescription());
        // STUB service method to create car

        return new ResponseEntity<Movie>(movie, HttpStatus.CREATED);
    }

    /*
     * Example DELETE
     */
    @RequestMapping(method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<?> deleteMovie() {
        // STUB service method to delete car
        return new ResponseEntity<String>("DELETE success", HttpStatus.OK);
    }

}


