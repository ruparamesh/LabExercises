package com.abc.dao;

import java.util.List;

import com.abc.entity.Author;
import com.abc.entity.Book;


public interface BookAuthorDao {
	String findAuthorByBookId(int ISBN);
	List<Book> getBooksInRange();
	List<Book> getBooksbyAuthorName(String name);
    List<Book> getAllBooks();

}
 