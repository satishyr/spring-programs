package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.bean.User;
import com.app.dao.IUserDao;
import com.app.service.IUserService;

@Service
public class ServiceUserImpl implements IUserService {
@Autowired
	private IUserDao dao;

	@Transactional
	public int save(User user) {
		
		return dao.save(user);
	}

	@Transactional
	public void update(User user) {
		dao.update(user);
		
	}

	@Transactional
	public void delete(int uid) {
		dao.delete(uid);
		
	}

	@Transactional(readOnly=true)
	
	public User getUserById(int uid) {
		
		return dao.getUserById(uid);
		
	}

	@Transactional(readOnly=true)
	public List<User> getAllUsers() {
		
		return dao.getAllUsers();
	
	}

}
