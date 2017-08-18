package com.service.impl;

import org.hibernate.HibernateException;
import org.springframework.beans.BeanUtils;

import com.bean.User;
import com.bean.UserForm;
import com.dao.BaseDao;
import com.service.UserManager;

//�û�ҵ���߼���ʵ����
public class UserManagerImpl implements UserManager{

	private BaseDao dao;
	public void setDao(BaseDao dao) {
		this.dao = dao;
	}

	//ע���û�
	public void regUser(UserForm userForm) throws HibernateException{
		User user=new User();
		BeanUtils.copyProperties(userForm, user);
		dao.saveObject(user);
	}

	//�û���¼У��
	public int logUser(String username, String password) throws Exception{
		
		try{
			User user=dao.findUser(username, password);
			
			//�ж��Ƿ����Ա
			if(user!=null&&user.getAdmin()==1){
				return 1;
			}
			if(user!=null&&user.getAdmin()==0){
				return 0;
			}
		}catch(Exception e){
			e.printStackTrace();
			throw new Exception("��֤�û���¼ʱ���ִ���");
		}		
		return -1;
		
		
	}

}
