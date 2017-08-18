package com.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;




import com.bean.Book;
import com.opensymphony.xwork2.ActionSupport;
import com.service.BookManager;

//管理员查看所有书籍的action
public class BooksAction extends ActionSupport{
	
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
			HttpServletRequest request=ServletActionContext.getRequest();
			List<Book> book=bookManager.queryBooks();
			request.setAttribute("book", book);
			if(book!=null){
				return "books";
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return "other";
		
	}

}
