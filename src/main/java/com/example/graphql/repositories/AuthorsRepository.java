package com.example.graphql.repositories;

import com.example.graphql.models.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorsRepository extends CrudRepository<Author, Integer> {
    Author findFirstByGivenName(String givenName);

    Author findFirstByFamilyName(String familyName);
    Author findFirstByGivenNameAndFamilyName(String givenName, String familyName);
}
