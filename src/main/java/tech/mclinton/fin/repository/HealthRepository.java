package tech.mclinton.fin.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import tech.mclinton.fin.models.HealthDocument;

public interface HealthRepository extends MongoRepository<HealthDocument, String>{
    @Query("{ 'message' : ?0 }")
    HealthDocument findByMessage(String message);

    public long count();
}
