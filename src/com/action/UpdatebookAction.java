package com.action;

import org.apache.struts2.ServletActionContext;

import com.bean.Book;
import com.opensymphony.xwork2.ActionSupport;
import com.service.BookManager;

//跳转到更新更新页面的action
public class UpdatebookAction extends ActionSupport {

	private Book book;

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

	public String execute() {
		int code = Integer.parseInt(ServletActionContext.getRequest().getParameter("code"));
		Book book=bookManager.findBook(code);
        ServletActionContext.getRequest().setAttribute("book", book);
		return SUCCESS;

	}

}
