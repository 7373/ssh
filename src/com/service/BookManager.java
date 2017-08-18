package com.service;

import java.util.List;

import com.bean.Book;
import com.bean.BookForm;

//书籍业务逻辑层接口
public interface BookManager {
	
	public List<Book> queryBooks() throws Exception;//查询所有书籍
	public Book findBook(int code);//根据code查找书籍
	public void addBook(BookForm bookForm);//添加书籍
	public void deleteBook(int code);//根据code删除书籍
	public void updateBook(Book book);//更新书籍
	public List<Book> findBook(String bookname);//根据bookname查找书籍

}
