package com.abc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import com.abc.entity.Author;
import com.abc.entity.Book;
import com.abc.util.JpaUtil;



public class BookAuthorDaoImp implements BookAuthorDao {

private EntityManagerFactory factory = null;
	
	public BookAuthorDaoImp() {
		factory = JpaUtil.getEntityManagerFactory();
	}
	
	@Override
	public List<Book> getAllBooks() {
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction txn = entityManager.getTransaction();
		txn.begin();
		TypedQuery<Book> query5 = entityManager.createNamedQuery("getAllBooks", Book.class);
        List<Book> books = query5.getResultList();
        txn.commit();
        entityManager.close();
        //books.stream().forEach(b-> System.out.println(b.getISBN()+" "+b.getTitle()+" "+b.getPrice()+" "+b.getAuthor()));
        return books;
	}
	
	@Override
	public List<Book> getBooksbyAuthorName(String name) {
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction txn = entityManager.getTransaction();
		txn.begin();
		TypedQuery<Book> query5 = entityManager.createNamedQuery("getBookByName", Book.class);
        List<Book> book2 = query5.getResultList();
        //books.stream().forEach(b-> System.out.println(b.getISBN()+" "+b.getTitle()+" "+b.getPrice()+" "+b.getAuthor()));
        txn.commit();
        return book2;
	}
	
	@Override
	public List<Book> getBooksInRange() {
		EntityManager entityManager = factory.createEntityManager();
		TypedQuery<Book> query4 = entityManager.createNamedQuery("getBooksRange", Book.class);
        List<Book> book1 = query4.getResultList();
        return book1;
	}
	
	@Override
	public  String findAuthorByBookId(int ISBN) {
		EntityManager entityManager = factory.createEntityManager(); 
		TypedQuery<Book> query = entityManager.createNamedQuery("getAuthorByBookId",Book.class);
		List<?> results = query.getResultList();
		return "author: ";
		
			}


}
