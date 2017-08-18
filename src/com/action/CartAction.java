package com.action;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.bean.Book;
import com.bean.Cart;
import com.opensymphony.xwork2.ActionSupport;
import com.service.BookManager;

//加入购物车的action
public class CartAction extends ActionSupport{
	Map<Integer,Cart> carts=new HashMap<Integer,Cart>();
	double sum=0;
	double money=0;
	private Cart cart;
    private Book book;
	
	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	private BookManager bookManager;
	
	public Book getBook() {
		return book;
	}
	
	public void setBook(Book book) {
		this.book = book;
	}

	public void setBookManager(BookManager bookManager) {
		this.bookManager = bookManager;
	}
	
	public String execute(){
		HttpSession session=ServletActionContext.getRequest().getSession();
		int code=Integer.parseInt(ServletActionContext.getRequest().getParameter("code"));	
		try{
			Book book=bookManager.findBook(code);
//			sum=Double.parseDouble(book.getPrice());
			
			money=Double.parseDouble(book.getPrice());
			if(session.getAttribute("sum")==null){
				sum=0;
			}
			sum=new BigDecimal(sum).add(new BigDecimal(money)).doubleValue();

//			判断商品是否存在
			Cart cart= (Cart) carts.get(book.getCode());
			if(cart!=null){
				cart.setNum(cart.getNum()+1);
			}else{
				carts.put(book.getCode(), new Cart(book, 1));					
			}
			
			ServletActionContext.getRequest().getSession().setAttribute("cart", carts);
			ServletActionContext.getRequest().getSession().setAttribute("sum", sum);
		}catch(Exception e){
			e.printStackTrace();
		}
		return SUCCESS;
	}
    
}
