package com.abc.service;

import com.abc.entity.Author;

public interface AuthorService {

	Author getAuthorById(int authorId);

	void saveProduct(Author author);

	void updateProduct(Author author);

	void deleteProduct(int authorId);

}
