<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Successfully Logged in....</h1>
<div>
<s:form action="searchaction">
<s:textfield name="search"/>
<s:submit value="search"/>
</s:form>
<s:form action="listofusers">
<s:submit value="list of Users"></s:submit>
</s:form>
</div>
</body>
</html>