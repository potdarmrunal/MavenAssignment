package com.springmvcassignment2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvcassignment2.dao.UserDao;
import com.springmvcassignment2.model.User;

@Service
public class UserService {
	@Autowired
	private UserDao userDao = new UserDao();
	public int createUser(User user) {
		return this.userDao.saveUser(user);
		
	}
	
	public List<User> fetchUser() {
		List<User> users =this.userDao.fetchUser();
		return users;
	}

}
