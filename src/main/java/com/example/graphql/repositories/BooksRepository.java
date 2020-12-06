package com.example.graphql.repositories;

import com.example.graphql.models.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BooksRepository extends CrudRepository<Book, Integer> {
    List<Book> findByAuthorId(Integer authorId);
}
