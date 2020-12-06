package com.example.graphql.queries;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphql.models.Book;
import com.example.graphql.repositories.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookQuery implements GraphQLQueryResolver {

    @Autowired
    private BooksRepository booksRepository;

    public List<Book> getBooks() {
        List<Book> allBooks = new ArrayList<>();
        booksRepository.findAll().forEach(allBooks::add);
        return allBooks;
    }

    public Book getBookById(Integer id) {
        return booksRepository.findById(id).orElse(null);
    }
}
