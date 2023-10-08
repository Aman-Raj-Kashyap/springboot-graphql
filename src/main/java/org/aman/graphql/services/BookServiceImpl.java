package org.aman.graphql.services;

import org.aman.graphql.entities.Book;
import org.aman.graphql.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    private BookRepository bookRepository;
    @Autowired
    public BookServiceImpl(BookRepository bookRepository){
        this.bookRepository=bookRepository;
    }

    @Override
    public Book createBook(Book book) {
        return this.bookRepository.save(book);
    }

    @Override
    public List<Book> getAllBook() {
        return bookRepository.findAll();
    }

    @Override
    public Book get(int id) {
        return this.bookRepository.findById(id).orElseThrow(()-> new RuntimeException("Book with id:"+id+" not found!"));
    }
}
