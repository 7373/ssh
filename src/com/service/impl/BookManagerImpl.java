package com.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;

import com.bean.Book;
import com.bean.BookForm;
import com.dao.BasebookDao;
import com.service.BookManager;

//书籍业务逻辑层实现类
public class BookManagerImpl implements BookManager{
	
	private BasebookDao dao;

	public void setDao(BasebookDao dao) {
		this.dao = dao;
	}
    
	//查询所有书籍
	public List<Book> queryBooks() throws Exception {
		
		return dao.queryBooks();
	}
    
	//根据code查找书籍
	public Book findBook(int code) {
		Book book=dao.findBook(code);
		return book;
	}

	//添加书籍
	public void addBook(BookForm bookForm) {
		
		Book book=new Book();
		BeanUtils.copyProperties(bookForm, book);
		try {
			dao.saveObject(book);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//根据code删除书籍
	public void deleteBook(int code) {
		dao.deleteBook(code);
		
	}

	//更新书籍
	public void updateBook(Book book) {
		dao.updateBook(book);
		
	}

	//根据bookname查找书籍
	public List<Book> findBook(String bookname) {
		List bookList=(List) dao.findBook(bookname);
		return (List<Book>) bookList;
	}

	
	

}
