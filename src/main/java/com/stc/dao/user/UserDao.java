package com.stc.dao.user;

import java.util.Collection;

import com.stc.domain.User;

public interface UserDao {

	<T> void save(T t);

	<T> void update(T t);

	User find(Integer id);

	Collection<User> findAll();

}
