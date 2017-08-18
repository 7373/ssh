<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<s:form action="addbook">
<s:textfield name="bookForm.bookname" label="书名"></s:textfield>
<s:textfield name="bookForm.author" label="作者"></s:textfield>
<s:textfield name="bookForm.price" label="价格"></s:textfield>
<s:textfield name="bookForm.booktype" label="图书类型"></s:textfield>
<s:textfield name="bookForm.publishing" label="出版社"></s:textfield>
<s:submit value="添加"/>
</s:form>
</body>
</html>