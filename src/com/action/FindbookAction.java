package com.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.bean.Book;
import com.opensymphony.xwork2.ActionSupport;
import com.service.BookManager;

//用户查找书籍的action
public class FindbookAction extends ActionSupport{
	
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
	
	public  String execute(){
		
		List<Book> bookList= (List<Book>) bookManager.findBook(book.getBookname());
		ServletActionContext.getRequest().setAttribute("list", bookList);
		return SUCCESS;
		
	}

}
