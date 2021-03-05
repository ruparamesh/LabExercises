package com.abc.ui;

import java.util.Scanner;

import com.abc.entity.Author;
import com.abc.service.AuthorService;
import com.abc.service.AuthorServiceImp;

public  class AuthorServiceMain {
	
	Scanner sc= new Scanner(System.in);
	
	static void AuthorById() {
		AuthorService service = new AuthorServiceImp();
		Scanner sc= new Scanner(System.in);
	
		System.out.println("Author id: ");
		int authorId=sc.nextInt();
		Author author=service.getAuthorById(authorId);
		if(author != null) {
			System.out.println("ID: "+author.getAuthorId()+" First Name:  "+author.getFirstName()+ " Middle Name: "+author.getMiddleName()+" Last Name:  "+author.getLastName()+" Phone No:  "+author.getPhoneNo());
		}
		else {
			System.out.println("Author not found with id: "+authorId);
		}
		sc.close();
	}
	
	static void saveAuthor() {
		AuthorService service = new AuthorServiceImp();
		Scanner sc= new Scanner(System.in);
		
		Author author= new Author();
		author.setAuthorId(102);
		author.setFirstName("Arun");
		author.setMiddleName("Kumar");
		author.setLastName("P");
		author.setPhoneNo("9685743257");
		
		service.saveProduct(author);
		System.out.println("Author Added ");
		sc.close();
	}
	
	static void update() {
		AuthorService service = new AuthorServiceImp();
	
		Author author1= new Author();
		author1.setAuthorId(102);
		author1.setFirstName("Arjun");
		author1.setMiddleName("K");
		author1.setLastName("Pandi");
		author1.setPhoneNo("954123257");
				
		service.updateProduct(author1);
		System.out.println("Author Updated ");
		
	}
	
	static void delete() {
		AuthorService service = new AuthorServiceImp();
		Scanner sc= new Scanner(System.in);

		System.out.println("Author id to be deleted: ");
		int authorId_delete=sc.nextInt();
				
		service.deleteProduct(authorId_delete);
		System.out.println("Author Deleted ");
		sc.close();
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Select the Operation ");
		System.out.println("\n 1.Find Author \n 2.Create Author \n 3.Update Author \n 4.Delete Author ");
		int operation=sc.nextInt();
		switch(operation) {
		  case 1:
			  AuthorById();
			  break;
		  case 2:
			  saveAuthor();
			  break;
		  case 3:
			  update();
			  break;
		  case 4:
			  delete();
			  break;
	  
			}
		sc.close();
}
	
}
