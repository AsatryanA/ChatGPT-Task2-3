package com.epam.chatgpttask23.service;

import com.epam.chatgpttask23.entity.Movie;
import com.epam.chatgpttask23.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Optional<Movie> getMovieById(String id) {
        return movieRepository.findById(id);
    }

    @Override
    public Movie createMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public Movie updateMovie(String id, Movie movie) throws ClassNotFoundException {
        if (!movieRepository.existsById(id)) {
            throw new ClassNotFoundException("Movie not found with id: " + id );
        }
        movie.setId(id);
        return movieRepository.save(movie);
    }

    @Override
    public void deleteMovie(String id) throws ClassNotFoundException {
        if (!movieRepository.existsById(id)) {
            throw new ClassNotFoundException("Movie not found with id: " + id);
        }
        movieRepository.deleteById(id);
    }

    @Override
    public List<Movie> searchByTitle(String title) {
        return movieRepository.findByTitleContainingIgnoreCase(title);
    }

    @Override
    public List<Movie> searchByReleaseDate(LocalDate releaseDate) {
        return movieRepository.findByReleaseDate(releaseDate);
    }
}
