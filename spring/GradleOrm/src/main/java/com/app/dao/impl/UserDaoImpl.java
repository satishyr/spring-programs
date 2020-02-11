package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.bean.User;
import com.app.dao.IUserDao;

@Repository
public class UserDaoImpl implements IUserDao {

	@Autowired
	private HibernateTemplate h;
	
	public int save(User user) {
		
		return (Integer)h.save(user);
	}

	
	
	public void update(User user) {
		h.update(user);
		
	}

	
	
	public void delete(int uid) {
		User user=new User();
		user.setUid(uid);
		h.delete(user);
		
	}

	
	public User getUserById(int uid) {
		User user=h.get(User.class, uid);
		return user;
	}

	
	public List<User> getAllUsers() {
		List<User> user=h.loadAll(User.class);
		return user;
	}

}
