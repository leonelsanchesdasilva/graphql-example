package com.example.graphql.repositories;

import com.example.graphql.models.Universe;
import org.springframework.data.repository.CrudRepository;

public interface UniversesRepository extends CrudRepository<Universe, Integer> {
}
