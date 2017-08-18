package com.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.bean.User;
import com.dao.BaseDao;

//�û�dao��ʵ����
public class UserDao extends HibernateDaoSupport implements BaseDao {
    
    //����û�
	public void saveObject(Object obj) throws HibernateException {
		getHibernateTemplate().save(obj);

	}
    
	//�����û����û���½У��
	public User findUser(String username, String password) {
		String hql = "from User as user where user.username=? and user.password=?";
		List userList = getHibernateTemplate().find(hql,new String[] { username, password });
		if (userList != null && userList.size() >= 1) {
			return (User) userList.get(0);
		} else {
			return null;
		}
	}
	

}
