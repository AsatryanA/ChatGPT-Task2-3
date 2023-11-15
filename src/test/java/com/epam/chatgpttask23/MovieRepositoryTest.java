package com.epam.chatgpttask23;

import com.epam.chatgpttask23.entity.Movie;
import com.epam.chatgpttask23.repository.MovieRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataMongoTest
@SpringBootTest
public class MovieRepositoryTest {

    @Autowired
    private MovieRepository movieRepository;

    @Test
    public void testSaveAndFindById() {
        Movie movie = new Movie("1", "Test Movie", LocalDate.now(), 120, new ArrayList<>(), new ArrayList<>());
        movieRepository.save(movie);
        Optional<Movie> retrievedMovie = movieRepository.findById("1");
        assertThat(retrievedMovie).isPresent();
        assertThat(retrievedMovie.get().getTitle()).isEqualTo("Test Movie");
    }

    @Test
    public void testFindByTitleContainingIgnoreCase() {
        Movie movie1 = new Movie("1", "Test Movie 1", LocalDate.now(), 120, new ArrayList<>(), new ArrayList<>());
        Movie movie2 = new Movie("2", "Test Movie 2", LocalDate.now(), 120, new ArrayList<>(), new ArrayList<>());
        movieRepository.saveAll(List.of(movie1, movie2));
        List<Movie> movies = movieRepository.findByTitleContainingIgnoreCase("test");
        assertThat(movies).hasSize(2);
    }

    // Add more repository tests as needed
}
