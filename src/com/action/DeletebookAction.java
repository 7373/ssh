package com.action;

import org.apache.struts2.ServletActionContext;

import com.bean.Book;
import com.opensymphony.xwork2.ActionSupport;
import com.service.BookManager;

//É¾³ýÊé¼®µÄaction
public class DeletebookAction extends ActionSupport{
	
	private Book book;
	
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	private BookManager bookManager;

	public void setBookManager(BookManager bookManager) {
		this.bookManager = bookManager;
	}
	
	public String execute(){	
		int code=Integer.parseInt(ServletActionContext.getRequest().getParameter("code"));
		bookManager.deleteBook(code);
		return SUCCESS;
		
	}

}
