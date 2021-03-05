package com.abc.ado;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.abc.entity.Author;
import com.abc.util.JpaUtil;


public class AuthorDaoImp implements AuthorDao {
	
	private EntityManagerFactory factory = null;
	
	public AuthorDaoImp() {
		factory = JpaUtil.getEntityManagerFactory();
	}
	@Override
	public Author findAuthorById(int authorId) {
		EntityManager entityManager = factory.createEntityManager();
		Author author = entityManager.find(Author.class, authorId);
		return author;
	}

	@Override
	public void save(Author author) {
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction txn = entityManager.getTransaction();
		txn.begin();
		entityManager.persist(author);
		txn.commit();
		
	}

	@Override
	public void update(Author author) {
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction txn = entityManager.getTransaction();
		txn.begin();
		entityManager.merge(author);
		txn.commit();
		
	}

	@Override
	public void delete(int authorId) {
		EntityManager entityManager = factory.createEntityManager();
		Author author = entityManager.find(Author.class, authorId);
		EntityTransaction txn = entityManager.getTransaction();
		txn.begin();
		entityManager.remove(author);
		txn.commit();
		
	}

	

}
