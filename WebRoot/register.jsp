<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>register</title>
</head>
<body style="background-image:url('images/test2.jpg')">
<s:form action="register">
<a href="/SSH/login.jsp" style="text-decoration:none">登录</a>
<s:textfield name="userForm.username" label="用户名"></s:textfield>
<s:password name="userForm.password" label="密码"></s:password>
<s:textfield name="userForm.phone" label="电话"></s:textfield>
<s:radio name="userForm.gender" list="%{#{'1':'男','0':'女'} }" value="1" ></s:radio>
<s:submit value="注册"></s:submit>
</s:form>  
</body>
</html>