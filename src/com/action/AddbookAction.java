package com.action;

import com.bean.BookForm;
import com.opensymphony.xwork2.ActionSupport;
import com.service.BookManager;

//管理员添加书籍的action
public class AddbookAction extends ActionSupport {

	private BookForm bookForm;

	public BookForm getBookForm() {
		return bookForm;
	}

	public void setBookForm(BookForm bookForm) {
		this.bookForm = bookForm;
	}

	private BookManager bookManager;



	public void setBookManager(BookManager bookManager) {
		this.bookManager = bookManager;
	}
	
	public  String execute(){
		try{
			bookManager.addBook(bookForm);
			return SUCCESS;
		}catch(Exception e){
			e.printStackTrace();
			return ERROR;
		}
		
		
	}

}
