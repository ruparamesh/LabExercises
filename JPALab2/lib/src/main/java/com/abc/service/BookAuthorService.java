package com.abc.service;


import java.util.List;

import com.abc.entity.Book;

public interface BookAuthorService {
	List<Book> displayAllBooks();
	List<Book> displayBooksbyAuthorName(String s);
	List<Book> displayBooksInRange();
	String findAuthorByBookId(int id);
}
