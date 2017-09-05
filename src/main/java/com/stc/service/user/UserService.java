package com.stc.service.user;

import java.util.Collection;

import com.stc.domain.User;

public interface UserService {

	<T> void save(T t);

	<T> void update(T t);

	User find(Integer id);
	
	Collection<User> findAll();
}
