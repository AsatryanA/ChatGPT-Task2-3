package com.epam.chatgpttask23.repository;

import com.epam.chatgpttask23.entity.Director;
import org.springframework.data.mongodb.repository.MongoRepository;

// DirectorRepository.java
public interface DirectorRepository extends MongoRepository<Director, String> {
}
