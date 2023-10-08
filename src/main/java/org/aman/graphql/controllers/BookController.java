package org.aman.graphql.controllers;

import lombok.Getter;
import lombok.Setter;
import org.aman.graphql.entities.Book;
import org.aman.graphql.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @MutationMapping("createBook")
    public Book create(@Argument BookInput book){
        Book b=new Book();
        b.setName(book.getName());
        b.setDescription(book.getDescription());
        b.setAuthorName(book.getAuthorName());
        b.setPrice(book.getPrice());
        b.setPages(book.getPages());
        return this.bookService.createBook(b);
    }

    @QueryMapping("allBooks")
    public List<Book> getAll(){
        return this.bookService.getAllBook();
    }

    @QueryMapping("getBook")
    public Book get(@Argument int id){
        return this.bookService.get(id);
    }
}

@Getter
@Setter
class BookInput{
    private String name;
    private String description;
    private String authorName;
    private double price;
    private int pages;
}