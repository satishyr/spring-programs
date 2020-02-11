package com.app.service;

import java.util.List;

import com.app.bean.User;

public interface IUserService {
	public int save(User user);
	public void update(User user);
	public void delete(int uid);
	public User getUserById(int uid);
	public List<User> getAllUsers();

}
