package com.abc.service;

import java.util.List;

import com.abc.dao.BookAuthorDao;
import com.abc.dao.BookAuthorDaoImp;
import com.abc.entity.Author;
import com.abc.entity.Book;

public class BookAuthorServiceImp implements BookAuthorService {

	BookAuthorDao dao = null;
    
    public BookAuthorServiceImp() {
        dao = new BookAuthorDaoImp();
    }
	@Override
	public List<Book> displayAllBooks() {
		
		return dao.getAllBooks();
	}

	@Override
	public List<Book> displayBooksbyAuthorName(String s) {
		
		return dao.getBooksbyAuthorName(s);
	}

	@Override
	public List<Book> displayBooksInRange() {
		
		return dao.getBooksInRange();
	}

	@Override
	public String findAuthorByBookId(int id) {
		// TODO Auto-generated method stub
		return dao.findAuthorByBookId(id);
	}

}
