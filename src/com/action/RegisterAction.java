package com.action;


import com.bean.UserForm;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserManager;

//ÓÃ»§×¢²áµÄaction
public class RegisterAction extends ActionSupport{
	
	private UserForm userForm;
	
	private UserManager userManager;
	
	
	public UserForm getUserForm() {
		return userForm;
	}
	
	public void setUserForm(UserForm userForm) {
		this.userForm = userForm;
	}
	
	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}
	
	public String execute(){
		try{
			userManager.regUser(userForm);
			return SUCCESS;
		}catch(Exception e){
			e.printStackTrace();
			return ERROR;
		}
		
		
	}
	

}
