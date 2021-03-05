package com.abc.ado;

import com.abc.entity.Author;

public interface AuthorDao {
	Author findAuthorById(int authorId);
    void save(Author author);
    void update(Author author);
    void delete(int authorId);
	
   

}
