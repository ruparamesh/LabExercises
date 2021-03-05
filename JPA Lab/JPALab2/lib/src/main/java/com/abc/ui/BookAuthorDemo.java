package com.abc.ui;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.abc.entity.Author;
import com.abc.entity.Book;

public class BookAuthorDemo {
	
	public static void main(String[] args) {
		
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("CAP-DB");
	EntityManager entityManager = factory.createEntityManager();
	
	Author author=new Author();
	author.setAuthorId(101);
	author.setAuthorName("Balaguruswamy");
	
	Set<Author> author1 = new HashSet<>();
	
	Book book1=new Book();
	book1.setISBN(1001);
	book1.setTitle("Java");
	book1.setPrice(500);
	book1.setAuthor(author1);
	
	Book book2=new Book();
	book2.setISBN(1002);
	book2.setTitle("C++");
	book2.setPrice(250);
	book1.setAuthor(author1);
	
	Book book3=new Book();
	book3.setISBN(1003);
	book3.setTitle("Spring Boot");
	book3.setPrice(850);
	book1.setAuthor(author1);
	
	Book book4=new Book();
	book4.setISBN(1004);
	book4.setTitle("ReactJS");
	book4.setPrice(1000);
	book1.setAuthor(author1);
	
	
	Set<Book> books = new HashSet<>();
	books.add(book1);
	books.add(book2);
	books.add(book3);
	books.add(book4);
	
	author.setBooks(books);
	
//	author.setBooks(books);
//	
	
	author1.add(author);
	
	EntityTransaction txn = entityManager.getTransaction();
	txn.begin();
	
	entityManager.persist(author);
	txn.commit();
	System.out.println("Books Entered");
	entityManager.close();		
	factory.close();		

}

}

