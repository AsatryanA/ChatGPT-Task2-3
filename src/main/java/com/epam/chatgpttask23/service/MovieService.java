package com.epam.chatgpttask23.service;

import com.epam.chatgpttask23.entity.Movie;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

// MovieService.java
public interface MovieService {
    List<Movie> getAllMovies();
    Optional<Movie> getMovieById(String id);
    Movie createMovie(Movie movie);
    Movie updateMovie(String id, Movie movie) throws ClassNotFoundException;
    void deleteMovie(String id) throws ClassNotFoundException;
    List<Movie> searchByTitle(String title);
    List<Movie> searchByReleaseDate(LocalDate releaseDate);
}

