<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" import="com.bean.Book" import="org.apache.struts2.ServletActionContext"%>
<%@ taglib prefix="s" uri="/struts-tags"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>

您购买的商品如下：<br/>
<table border="1">
<tr>
<td>图书名</td>
<td>价格</td>
<td>数量</td>
</tr>
<s:iterator value="#session.all">
<tr>
<td><s:property value="value.book.bookname"/></td>
<td><s:property value="value.book.price"/></td>
<td><s:property value="value.num"/></td>
</tr>
</s:iterator>
</table>
<br/>
总价是：<s:property value="#session.rmb"/>元
<br/>
<a href="checkcart.action" style="text-decoration:none">结算</a>
<br/>
<a href="cartoff.action" style="text-decoration:none">清空购物车</a>&nbsp;
<a href="book.action" style="text-decoration:none">继续购物</a>
</body>
</html>