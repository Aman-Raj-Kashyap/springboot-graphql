package org.aman.graphql;

import org.aman.graphql.entities.Book;
import org.aman.graphql.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlSpringApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlSpringApplication.class, args);
	}

	@Autowired
	private BookService bookService;

	@Override
	public void run(String... args) throws Exception {
		Book b1=new Book(1,"Let us C","C language book","XYZ",499,700);
		bookService.createBook(b1);

		Book b2=new Book(2,"Blackbook Java","Java Programming language book","ABC",850,1200);
		bookService.createBook(b2);

		Book b3=new Book(3,"Arihant CDS Exam Book","CDS Preparation book","MNO",600,1400);
		bookService.createBook(b3);
	}
}
