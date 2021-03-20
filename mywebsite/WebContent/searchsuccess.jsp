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
<h1>success.wjnfevjefnvoern</h1>

<table border="1" style= "width:100%">
<tr>
<th>ID</th><th>Name</th><th>Password</th><th>Email</th><th>Gender</th><th>Country</th>
</tr>
<s:iterator value="list">
<tr>
<td><s:property value="id"/></td>
<td><s:property value="username"/></td>
<td><s:property value="password"/></td>
<td><s:property value="email"/></td>
<td><s:property value="gender"/></td>
<td><s:property value="country"/></td>
</tr>
</s:iterator>
</table>
</body>
</html>