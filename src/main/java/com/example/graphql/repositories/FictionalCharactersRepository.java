package com.example.graphql.repositories;

import com.example.graphql.models.FictionalCharacter;
import org.springframework.data.repository.CrudRepository;

public interface FictionalCharactersRepository extends CrudRepository<FictionalCharacter, Integer> {
}
