package com.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.bean.Cart;
import com.opensymphony.xwork2.ActionSupport;

//查看购物车的action
public class CartsAction extends ActionSupport{

	double rmb=0;
	
	public String execute(){
		HttpSession session=ServletActionContext.getRequest().getSession();
		try{		
        if(session.getAttribute("sum")==null){
        	rmb=0;
        }else{
        rmb= (Double) session.getAttribute("sum");
//		rmb= (Double) session.getAttribute("sum")+rmb;
        }

		@SuppressWarnings("unchecked")
		Map<Integer,Cart> carts =  (Map<Integer, Cart>) session.getAttribute("cart");
		if(carts==null){
			carts=new HashMap<Integer, Cart>();		
		} 
		session.setAttribute("all", carts);
		session.setAttribute("rmb", rmb);
		}catch(Exception e){
			e.printStackTrace();
		}
		return SUCCESS;
		
	}

}
