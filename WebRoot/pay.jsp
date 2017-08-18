<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>
付款成功！<br/>
总共支付<s:property value="#session.rmb"/>元，感谢您的支持！<br/>
<a href="cartoff.action" style="text-decoration:none">继续购物</a>
</body>
</html>