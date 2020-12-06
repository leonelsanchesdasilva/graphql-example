package com.example.graphql.queries;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphql.models.Author;
import com.example.graphql.repositories.AuthorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AuthorQuery implements GraphQLQueryResolver {

    @Autowired
    private AuthorsRepository authorsRepository;

    public List<Author> getAuthors() {
        List<Author> allAuthors = new ArrayList<>();
        authorsRepository.findAll().forEach(allAuthors::add);
        return allAuthors;
    }

    public Author getAuthorById(Integer id) {
        Author author = authorsRepository.findById(id).orElse(null);
        return author;
    }
}
