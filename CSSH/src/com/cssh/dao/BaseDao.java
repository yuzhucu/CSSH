package com.cssh.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.cssh.pojo.User;

public interface BaseDao {
	public void saveObject(Object obj) throws HibernateException;

	

	public List<User> getUsers() throws HibernateException;
}