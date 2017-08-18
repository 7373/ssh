package com.dao;

import org.hibernate.HibernateException;

import com.bean.User;

//用户dao层接口
public interface BaseDao {
	
	public void saveObject(Object obj) throws HibernateException;//添加用户
	
	public User findUser(String username,String password);//查找用户
	
	
}