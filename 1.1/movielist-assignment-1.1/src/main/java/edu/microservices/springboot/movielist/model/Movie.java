package edu.microservices.springboot.movielist.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="movies")
public class Movie {
    @Id @GeneratedValue
    @Column(name="movie_id")
    private int movie_id;

    @NotNull
    @Column(name="viewer")
    @Size(min = 3, max = 50)
    private String viewer;

    @NotNull
    @Column(name="title")
    @Size(min = 3, max = 50)
    private String title;

    @NotNull
    @Column(name="year")
    private int year;

    @NotNull
    @Column(name="director")
    @Size(min = 3, max = 50)
    private String director;

    @NotNull
    @Column(name="star")
    @Size(min = 3, max = 50)
    private String star;

    @NotNull
    @Column(name="description")
    @Size(min = 0, max = 500)
    private String description;

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public String getViewer() {
        return viewer;
    }

    public void setViewer(String viewer) {
        this.viewer = viewer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Movie withViewer(String viewer){
        this.setViewer(viewer);
        return this;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movie_id=" + movie_id +
                ", viewer='" + viewer + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", director='" + director + '\'' +
                ", star='" + star + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
