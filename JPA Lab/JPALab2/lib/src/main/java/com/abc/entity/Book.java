package com.abc.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="book_tbl")
@NamedQueries({     
    @NamedQuery(name = "getAllBooks", query = "select b from Book b"),
    @NamedQuery(name = "getBookByName", query = "select b from Book b where Author.authorName = :bauthor") ,
    @NamedQuery(name = "getBooksRange", query = "select b from Book b where b.price BETWEEN 500 AND 1000"),
    @NamedQuery(name = "getAuthorByBookId", query = "select b from Book b where Author.id = 1")
   })
public class Book {
	@Id
	@Column(name = "book_id")
	private int ISBN;
	
	@Column(name = "title")
	private String title;
	
	private double price;
	
	@ManyToMany
	@JoinTable(name = "book_author", joinColumns = { @JoinColumn(name = "book_id") }, inverseJoinColumns = { @JoinColumn(name = "author_id") })
	private Set<Author> author = new HashSet<>() ;

	public int getISBN() {
		return ISBN;
	}

	public Set<Author> getAuthor() {
		return author;
	}

	public void setAuthor(Set<Author> author) {
		this.author = author;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
		
	
}
