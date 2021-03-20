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
<h1>success edit</h1>
<s:form>
<table>
<tr>
<td><s:textfield name="id" label="ID"/></td>
</tr>
<tr>
<td><s:textfield name="username" label="Name"/></td>
</tr>
<tr>
<td><s:password name="password" label="Password"/></td>
</tr>
<tr>
<td><s:textfield name="email" label="Email id"/></td>
</tr>
<tr>
<td><s:radio list="{'male','female'}" name="gender" label="Gender"/></td>
</tr>
<tr>
<td><s:select list="{'INDIA','USA','ENGLEND','NEWZEALAND','AUSTRALIA'}" name="country" label="Country"/></td>
</tr>
<tr><td><s:submit value="submit"/></td></tr>
</table>
</s:form>
</body>
</html>