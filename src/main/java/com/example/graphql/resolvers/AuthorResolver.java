package com.example.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.graphql.models.Author;
import com.example.graphql.models.Book;
import com.example.graphql.repositories.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AuthorResolver implements GraphQLResolver<Author> {

    @Autowired
    private BooksRepository booksRepository;

    public List<Book> getBooks(Author author) {
        return booksRepository.findByAuthorId(author.getId());
    }
}
