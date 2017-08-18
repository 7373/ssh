package com.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.bean.Book;
import com.dao.BasebookDao;

//�鼮dao�ӿ�ʵ����
public class BookDao extends HibernateDaoSupport implements BasebookDao{
    
	//��ѯ�����鼮
	public List<Book> queryBooks() throws Exception {

		return this.getHibernateTemplate().find("from Book");
	}
    
	//����code�����鼮
	public Book findBook(int code) {
		String hql="from Book as book where code=?";
		List bookList=getHibernateTemplate().find(hql, code);
		if(bookList!=null&&bookList.size()>=1){
			return (Book) bookList.get(0);
		}else{
		return null;
		}
	}

	//����鼮
	public void saveObject(Object obj) throws Exception {
		getHibernateTemplate().save(obj);
		
	}

	//����codeɾ���鼮
	public void deleteBook(int code) {
		getHibernateTemplate().delete(findBook(code));	
	}

	//�����鼮
	public void updateBook(Book book) {
		getHibernateTemplate().update(book);
		
	}

	//����bookname�����鼮��ģ�����ң�
	public List<Book> findBook(String bookname) {
		String hql="from Book as book where bookname like '%"+bookname+"%'";
		List bookList=getHibernateTemplate().find(hql);
		if(bookList!=null){
			return (List<Book>) bookList;
		}else{
		return null;
		}
		
	}


}
