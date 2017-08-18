<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.bean.Book" import="org.apache.struts2.ServletActionContext"%>
<%@ taglib prefix="s" uri="/struts-tags"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<s:form action="updatebooks.action">
<s:textfield name="book.code" label="条形码" value="%{#request.book.code}" readOnly="true"></s:textfield>
<s:textfield name="book.bookname" label="书名" value="%{#request.book.bookname}"></s:textfield>
<s:textfield name="book.author" label="作者" value="%{#request.book.author}"></s:textfield>
<s:textfield name="book.price" label="价格" value="%{#request.book.price}"></s:textfield>
<s:textfield name="book.booktype" label="图书类型" value="%{#request.book.booktype}"></s:textfield>
<s:textfield name="book.publishing" label="出版社" value="%{#request.book.publishing}"></s:textfield>
<s:submit value="更新"/>
</s:form>
</body>
</html>