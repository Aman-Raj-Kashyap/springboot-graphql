package org.aman.graphql.services;

import org.aman.graphql.entities.Book;

import java.util.List;

public interface BookService {
    Book createBook(Book book);
    List<Book> getAllBook();
    Book get(int id);
}
