<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="${pageContext.request.contextPath }/aController/login?language=zh_CN">中文</a>
&nbsp;&nbsp;&nbsp;
<a href="${pageContext.request.contextPath }/aController/login?language=en_US">English</a>
<br />
<form action="" method="get">

<fmt:message key="login.username"></fmt:message>:<input type="text" /><br />
<fmt:message key="login.password"></fmt:message>:<input type="password"/><br />
<input type="submit" value='<fmt:message key="login.login"></fmt:message>' />
</form>

<a href="${pageContext.request.contextPath}/aController/hello">hello</a>
</body>
</html>