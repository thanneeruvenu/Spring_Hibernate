package com.stc.service.user;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stc.dao.user.UserDao;
import com.stc.domain.User;
import com.stc.service.AbstractServiceBase;

@Service
@Transactional 
public class UserServiceImpl extends AbstractServiceBase implements UserService{
	
	@Autowired
	UserDao userDaoImpl;

	@Override
	public <T> void save(T t) {
		userDaoImpl.save(t);		
	}

	@Override
	public <T> void update(T t) {
		userDaoImpl.save(t);		
	}

	@Transactional(readOnly = true)
	@Override
	public User find(Integer id) {
		return userDaoImpl.find(id);		
	}

	@Transactional(readOnly = true)
	@Override
	public Collection<User> findAll() {
		return userDaoImpl.findAll();
	}

	
	
}
