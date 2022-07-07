package com.aws.codestar.projecttemplates;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class BookSafe {

	private ArrayList<Book> bookSafe;
	
	public BookSafe() {
		this.bookSafe = new ArrayList<Book>();
	}

	public ArrayList<Book> getBookSafe() {
		return bookSafe;
	}
	
	public void addBook(Book b) {
		bookSafe.add(b);
	}	
}
