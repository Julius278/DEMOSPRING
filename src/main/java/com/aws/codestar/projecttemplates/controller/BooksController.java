package com.aws.codestar.projecttemplates.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aws.codestar.projecttemplates.Book;
import com.aws.codestar.projecttemplates.BookSafe;

@RestController
public class BooksController {

	@Autowired
	private BookSafe bookSafe;
	
	int i = 1;
	// map /books
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		
		return Arrays.asList(new Book(12, "Test", "Max Mustermann"));
	}

	@GetMapping("/checkBooks")
	public List<Book> getNumberOfBooks() {
		return bookSafe.getBookSafe();
	}
	
	@GetMapping("/addBook")
	public int addBook() {
		i++;
		bookSafe.getBookSafe().add(new Book(i, "Test12345", "Test"));
		return bookSafe.getBookSafe().size();
	}
	
	@PostMapping("/postBook")
	public int postBook() {
		i++;
		bookSafe.getBookSafe().add(new Book(i, "Test", "Test"));
		return bookSafe.getBookSafe().size();
	}
	
	public int getI() {
		return i;
	}
}
