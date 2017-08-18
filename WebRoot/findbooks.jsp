<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.bean.Book" import="org.apache.struts2.ServletActionContext"%>
<%@ taglib prefix="s" uri="/struts-tags"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>home</title>
</head>
<body>
<%=ServletActionContext.getRequest().getSession().getValue("username")%>，管理员，欢迎你！
&nbsp;&nbsp;&nbsp;
<a href="/SSH/loginoff.action" style="text-decoration:none">注销</a>
<br/>
<s:form action="findbooks.action" >
<s:textfield name="book.bookname"></s:textfield>
<s:submit value="搜索"></s:submit>
</s:form>
&nbsp;&nbsp;&nbsp;
<a href="/SSH/addbook.jsp" style="text-decoration:none">添加书籍</a>
<table border="1">
<tr>
<td>条形码</td>
<td>图书名</td>
<td>作者</td>
<td>价格</td>
<td>图书类型</td>
<td>出版社</td>
<td>库存总数</td>
</tr>
<s:iterator value="#request.list" id="ls">
<tr>
<td><s:property value="code"/></td>
<td><s:property value="bookname"/></td>
<td><s:property value="author"/></td>
<td><s:property value="price"/></td>
<td><s:property value="booktype"/></td>
<td><s:property value="publishing"/></td>
<td><a href="deletebook.action?code=<s:property value="code"/>" style="text-decoration:none">删除</a></td>
<td><a href="updatebook.action?code=<s:property value="code"/>" style="text-decoration:none">更新</a></td>
</tr>
</s:iterator>
</table>
</body>
</html>