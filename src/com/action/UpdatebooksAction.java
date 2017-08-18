package com.action;

import com.bean.Book;
import com.opensymphony.xwork2.ActionSupport;
import com.service.BookManager;

//管理员更新书籍的action
public class UpdatebooksAction extends ActionSupport{
	
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
	
	public String execute(){
		
		try{
			bookManager.updateBook(book);
			return SUCCESS;
		}catch(Exception e){
			e.printStackTrace();
			return ERROR;
		}
		
	}

}
