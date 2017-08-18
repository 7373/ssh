package com.action;

import org.apache.struts2.ServletActionContext;

import com.bean.User;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserManager;

//µÇÂ¼action
public class LoginAction extends ActionSupport{
	private User user;
	
	private UserManager userManager;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}
	

	
    public String execute() throws Exception{	
    	ServletActionContext.getRequest().getSession().putValue("username", user.getUsername());
    	int login=userManager.logUser(user.getUsername(), user.getPassword());   
    	if(login==1){ 
    		return "admin";		
    	}
    	if(login==0){
    		return "user";
    	}
    	else{
    		return "error";
    	}
    	
		
    	
    }
}
