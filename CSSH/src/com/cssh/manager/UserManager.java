package com.cssh.manager;

import java.util.List;
import org.hibernate.HibernateException;
import com.cssh.dao.BaseDao;
import com.cssh.dao.impl.UserDao;
import com.cssh.pojo.User;
public class UserManager {
	private BaseDao dao;  
	
	public UserManager(){
		dao = new UserDao();
		System.out.println("UserManager IN");
	}
   
    public BaseDao getDao() {
		return dao;
	}
	public void setDao(BaseDao dao) {
		this.dao = dao;
	}
	public List<User> getUsers() throws HibernateException {  
    	return dao.getUsers();
    } 
}