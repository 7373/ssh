package com.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.bean.Book;
import com.dao.BasebookDao;

//书籍dao接口实现类
public class BookDao extends HibernateDaoSupport implements BasebookDao{
    
	//查询所有书籍
	public List<Book> queryBooks() throws Exception {

		return this.getHibernateTemplate().find("from Book");
	}
    
	//根据code查找书籍
	public Book findBook(int code) {
		String hql="from Book as book where code=?";
		List bookList=getHibernateTemplate().find(hql, code);
		if(bookList!=null&&bookList.size()>=1){
			return (Book) bookList.get(0);
		}else{
		return null;
		}
	}

	//添加书籍
	public void saveObject(Object obj) throws Exception {
		getHibernateTemplate().save(obj);
		
	}

	//根据code删除书籍
	public void deleteBook(int code) {
		getHibernateTemplate().delete(findBook(code));	
	}

	//更新书籍
	public void updateBook(Book book) {
		getHibernateTemplate().update(book);
		
	}

	//根据bookname查找书籍（模糊查找）
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
