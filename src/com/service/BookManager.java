package com.service;

import java.util.List;

import com.bean.Book;
import com.bean.BookForm;

//�鼮ҵ���߼���ӿ�
public interface BookManager {
	
	public List<Book> queryBooks() throws Exception;//��ѯ�����鼮
	public Book findBook(int code);//����code�����鼮
	public void addBook(BookForm bookForm);//����鼮
	public void deleteBook(int code);//����codeɾ���鼮
	public void updateBook(Book book);//�����鼮
	public List<Book> findBook(String bookname);//����bookname�����鼮

}
