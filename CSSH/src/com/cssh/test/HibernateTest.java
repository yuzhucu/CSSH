package com.cssh.test;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import com.cssh.dao.BaseDao;
import com.cssh.dao.impl.UserDao;
import com.cssh.manager.UserManager;
import com.cssh.pojo.User;
public class HibernateTest {
	public static void main(String[] args) {
		UserManager userManager=new UserManager();
        userManager.getUsers();
	}
}