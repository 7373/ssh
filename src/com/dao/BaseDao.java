package com.dao;

import org.hibernate.HibernateException;

import com.bean.User;

//�û�dao��ӿ�
public interface BaseDao {
	
	public void saveObject(Object obj) throws HibernateException;//����û�
	
	public User findUser(String username,String password);//�����û�
	
	
}