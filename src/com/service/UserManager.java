package com.service;

import com.bean.UserForm;

//�û�ҵ���߼���ӿ�
public interface UserManager {
	public void regUser(UserForm userForm);//ע���û�
	public int logUser(String username, String password) throws Exception;//�û���¼У��

}
