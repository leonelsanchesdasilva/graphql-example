package com.example.graphql.mutations;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.graphql.models.Author;
import com.example.graphql.models.Book;
import com.example.graphql.repositories.AuthorsRepository;
import com.example.graphql.repositories.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookMutation implements GraphQLMutationResolver {

    @Autowired
    private BooksRepository booksRepository;

    @Autowired
    private AuthorsRepository authorsRepository;

    public Book createBook(final String name, final Integer pageCount, final String authorGivenName,
                           final String authorFamilyName) {
        Author author = authorsRepository.findFirstByGivenNameAndFamilyName(authorGivenName, authorFamilyName);
        if (author == null) return null;
        Book book = new Book(null, name, pageCount, author);
        booksRepository.save(book);
        return book;
    }
}
