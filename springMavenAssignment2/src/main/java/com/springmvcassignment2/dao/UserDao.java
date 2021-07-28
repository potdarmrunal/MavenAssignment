package com.springmvcassignment2.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.springmvcassignment2.model.User;
@Repository
public class UserDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int saveUser(User user) {
		int id = (Integer) this.hibernateTemplate.save(user);
		return id;
	}
	
	public List<User> fetchUser() {
		List<User> users =this.hibernateTemplate.loadAll(User.class);
		return users;
	}

}
