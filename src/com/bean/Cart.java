package com.bean;

import java.io.Serializable;

//¹ºÎï³µbean
public class Cart implements Serializable{
	
	private Book book;
	private int num;
	
	
	public Cart(Book book, int num) {
		super();
		this.book = book;
		this.num = num;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	

}
