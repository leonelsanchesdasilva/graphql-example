package com.example.graphql.mutations;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.graphql.models.Author;
import com.example.graphql.repositories.AuthorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuthorMutation implements GraphQLMutationResolver {

    @Autowired
    private AuthorsRepository authorsRepository;

    public Author createAuthor(final String firstName, final String lastName) {
        Author author = new Author(null, firstName, lastName, null);
        authorsRepository.save(author);
        return author;
    }
}
