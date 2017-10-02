package com.stc.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class AbstractDaoBase {

	@PersistenceContext
	protected EntityManager em;

	public <T> void save(T t) {
		em.persist(t);
	}

	public <T> void update(T t) {
		em.merge(t);
	}


}
