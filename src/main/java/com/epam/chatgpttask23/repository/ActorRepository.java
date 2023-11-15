package com.epam.chatgpttask23.repository;

import com.epam.chatgpttask23.entity.Actor;
import org.springframework.data.mongodb.repository.MongoRepository;

// ActorRepository.java
public interface ActorRepository extends MongoRepository<Actor, String> {
}
