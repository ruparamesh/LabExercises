package com.abc.ui;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.abc.entity.Author;
import com.abc.entity.Book;
import com.abc.service.BookAuthorServiceImp;




public class BookAuthorMain {
	static Scanner sc = new Scanner(System.in);
	static BookAuthorMain bm = new BookAuthorMain();
	BookAuthorServiceImp service = new BookAuthorServiceImp();
	
	public int getId() {

		System.out.print("Enter Author ID : ");
		int aid = sc.nextInt();
		return aid;
	}
	
	public String getName() {

		System.out.print("Enter Author Name : ");
		String name = sc.next();
		return name;
	}
	
	public String getTitle() {

		System.out.print("Enter Book Title : ");
		String title = sc.next();
		return title;
	}
	
	public int getBookIsbn() {

		System.out.print("Enter Book ISBN : ");
		int isbn = sc.nextInt();
		return isbn;
	}
	
	public int getPrice() {

		System.out.print("Enter Book Price : ");
		int aid = sc.nextInt();
		return aid;
	}
	
	private void addInfo() {
		Author author = new Author();
		author.setAuthorId(bm.getId());
		author.setAuthorName(bm.getName());
		
		Set<Author> auth = new HashSet<>();
		auth.add(author);
		
		Book book = new Book();
		book.setISBN(bm.getBookIsbn());
		book.setTitle(bm.getTitle());
		book.setPrice(bm.getPrice());
		book.setAuthor(auth);
		
			}
	
	private void getAll() {
		System.out.println("\n");
		List<Book> Books = service.displayAllBooks();
		for(Book bk : Books) {
			System.out.println(bk.getISBN() + " " + bk.getTitle() + " " + bk.getPrice());
		}
	}
	
	
	private void getAuth() {
		System.out.println(service.findAuthorByBookId(getId()));
		}
	
	private void getRange() {
		
		List<Book> books = service.displayBooksInRange();
		
		for(Book bk : books) {
			System.out.println(bk.getISBN() + " " + bk.getTitle() + " " + bk.getPrice());
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter Option :\n 1 - Query all  \n 2 - Query By Auth name \n 3 - List book in price range \n 4 - list auth name with book id \n");
		Scanner sc = new Scanner(System.in);

		
		int option = sc.nextInt();
		
		switch(option){
		
		case 1:
			bm.addInfo();
	        break;
	        
		case 2:    
			bm.getAll();
			break;
		
		case 3:

			break;
		
		case 4:
			bm.getRange();
			break;
			
		case 5:
			bm.getAuth();
			break;
			
		default:
			System.out.println("Enter valid Option");
		
		}
        sc.close(); 
		
	}
}
