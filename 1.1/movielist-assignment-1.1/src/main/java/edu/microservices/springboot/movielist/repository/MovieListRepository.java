package edu.microservices.springboot.movielist.repository;

import edu.microservices.springboot.movielist.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface MovieListRepository
        extends JpaRepository<Movie, String>
{
    List<Movie> findMovieByViewerEquals(String viewer);
}
