<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>register</title>
</head>
<body>
<table border="1">
<tr>
<td>书名</td>
<td>价格</td>
<td>数量</td>
</tr>
<tr>
<td><s:property value="%{#request.book.bookname}"/></td>
<td><s:property value="%{#request.book.price}"/></td>
<td>1</td>
</tr>
</table>
<br/>
总价是：<s:property value="%{#request.book.price}"/>元
<s:property value="#request.price"/>
<br/>
<a href="/SSH/paynow.jsp" style="text-decoration:none">结算</a>
</body>
</html>