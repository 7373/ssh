package com.service;

import com.bean.UserForm;

//用户业务逻辑层接口
public interface UserManager {
	public void regUser(UserForm userForm);//注册用户
	public int logUser(String username, String password) throws Exception;//用户登录校验

}
