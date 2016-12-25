package com.cssh.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import com.cssh.dao.BaseDao;
import com.cssh.pojo.User;

public class UserDao extends HibernateDaoSupport implements BaseDao{
	
	public UserDao() {
		System.out.println("UserDao IN");
	}
  
    @Override  
    public void saveObject(Object obj) throws HibernateException {  
    	getHibernateTemplate().save(obj);  
    }  
    
    public List<User> getUsers() throws HibernateException{
    	List<User> users=getHibernateTemplate().loadAll(User.class);
    	return users;
    }
}