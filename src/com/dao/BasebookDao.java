package com.dao;

import java.util.List;

import com.bean.Book;

//�鼮dao��ӿ�
public interface BasebookDao {
	public List<Book> queryBooks() throws Exception;//��ѯ�����鼮
	public Book findBook(int code);//����code�����鼮
	public void saveObject(Object obj)throws Exception;//����鼮
	public void deleteBook(int code);//����codeɾ���鼮
	public void updateBook(Book book);//�����鼮
	public List<Book> findBook(String bookname);//����bookname�����鼮

}
