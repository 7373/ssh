package com.service.impl;

import org.hibernate.HibernateException;
import org.springframework.beans.BeanUtils;

import com.bean.User;
import com.bean.UserForm;
import com.dao.BaseDao;
import com.service.UserManager;

//用户业务逻辑层实现类
public class UserManagerImpl implements UserManager{

	private BaseDao dao;
	public void setDao(BaseDao dao) {
		this.dao = dao;
	}

	//注册用户
	public void regUser(UserForm userForm) throws HibernateException{
		User user=new User();
		BeanUtils.copyProperties(userForm, user);
		dao.saveObject(user);
	}

	//用户登录校验
	public int logUser(String username, String password) throws Exception{
		
		try{
			User user=dao.findUser(username, password);
			
			//判断是否管理员
			if(user!=null&&user.getAdmin()==1){
				return 1;
			}
			if(user!=null&&user.getAdmin()==0){
				return 0;
			}
		}catch(Exception e){
			e.printStackTrace();
			throw new Exception("验证用户登录时出现错误");
		}		
		return -1;
		
		
	}

}
