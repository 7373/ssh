package com.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

//��鹺�ﳵ�Ƿ�Ϊ�յ�action
public class CheckcartAction extends ActionSupport {
	
	public String execute(){
		
		HttpSession session=ServletActionContext.getRequest().getSession();
		if(session.getAttribute("sum")==null){
			return ERROR;
		}
		return SUCCESS;
		
	}

}
