package com.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;

import com.bean.Book;
import com.bean.BookForm;
import com.dao.BasebookDao;
import com.service.BookManager;

//�鼮ҵ���߼���ʵ����
public class BookManagerImpl implements BookManager{
	
	private BasebookDao dao;

	public void setDao(BasebookDao dao) {
		this.dao = dao;
	}
    
	//��ѯ�����鼮
	public List<Book> queryBooks() throws Exception {
		
		return dao.queryBooks();
	}
    
	//����code�����鼮
	public Book findBook(int code) {
		Book book=dao.findBook(code);
		return book;
	}

	//����鼮
	public void addBook(BookForm bookForm) {
		
		Book book=new Book();
		BeanUtils.copyProperties(bookForm, book);
		try {
			dao.saveObject(book);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//����codeɾ���鼮
	public void deleteBook(int code) {
		dao.deleteBook(code);
		
	}

	//�����鼮
	public void updateBook(Book book) {
		dao.updateBook(book);
		
	}

	//����bookname�����鼮
	public List<Book> findBook(String bookname) {
		List bookList=(List) dao.findBook(bookname);
		return (List<Book>) bookList;
	}

	
	

}
