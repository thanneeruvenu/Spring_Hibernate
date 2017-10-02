package com.stc.dao.user;

import java.util.Collection;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.stc.dao.AbstractDaoBase;
import com.stc.domain.User;

@Repository
@Transactional
public class UserDaoImpl extends AbstractDaoBase implements UserDao {

	@Transactional(readOnly = true)
	@Override
	public User find(Integer id) {
		return em.find(User.class, id);
	}

	@Transactional(readOnly = true)
	@Override
	public Collection<User> findAll() {
	 return	em.createQuery("SELECT c FROM User c", User.class).getResultList();
	}


}
