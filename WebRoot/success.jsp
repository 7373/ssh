<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="org.apache.struts2.ServletActionContext"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<%=ServletActionContext.getRequest().getSession().getValue("username")%>
<br/>
恭喜你注册成功！
<a href="/SSH/login.jsp" style="text-decoration:none">点击此处跳转到登录页面</a>
</body>
</html>