package com.epam.chatgpttask23.repository;


import com.epam.chatgpttask23.entity.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDate;
import java.util.List;

// MovieRepository.java
public interface MovieRepository extends MongoRepository<Movie, String> {
    List<Movie> findByTitleContainingIgnoreCase(String title);
    List<Movie> findByReleaseDate(LocalDate releaseDate);
}

