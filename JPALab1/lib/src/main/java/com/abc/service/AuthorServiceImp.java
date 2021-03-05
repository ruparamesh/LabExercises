package com.abc.service;


import com.abc.ado.AuthorDao;
import com.abc.ado.AuthorDaoImp;
import com.abc.entity.Author;

public class AuthorServiceImp implements AuthorService {

	AuthorDao dao = null;
	    
	    public AuthorServiceImp() {
	        dao = new AuthorDaoImp();
	    }
	@Override
	public Author getAuthorById(int authorId) {
		Author author =dao.findAuthorById(authorId);        
        return author;
	}

	@Override
	public void saveProduct(Author author) {
		dao.save(author);
		
	}

	@Override
	public void updateProduct(Author author) {
		dao.update(author);
		
	}

	@Override
	public void deleteProduct(int authorId) {
		dao.delete(authorId);       
        
	}

}
