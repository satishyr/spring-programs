package com.app.service;

import java.util.List;

import com.app.bean.User;

public interface IUserService {
	public abstract int save(User user);
	public abstract void update(User user);
	public abstract void delete(int uid);
	public abstract User getUserById(int uid);
	public abstract List<User> getAllUsers();

}
