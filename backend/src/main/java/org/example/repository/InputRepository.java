package org.example.repository;

import org.example.model.InputData;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InputRepository extends MongoRepository<InputData,String> {
}
