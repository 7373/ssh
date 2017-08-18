package com.action;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.bean.Cart;
import com.opensymphony.xwork2.ActionSupport;

//清空购物车的action
public class CartoffAction extends ActionSupport{
	
	public String execute() throws Exception{
		HttpSession session=ServletActionContext.getRequest().getSession(false);
		@SuppressWarnings("unchecked")
		Map<Integer, Cart> carts =  (Map<Integer, Cart>) session.getAttribute("cart");
		if(carts!=null){
		carts.clear();
		}
		session.removeAttribute("cart");
		session.removeAttribute("all");
		session.removeAttribute("sum");
		session.removeAttribute("rmb");
		return super.execute();
		
	}

}