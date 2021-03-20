<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Login Form</title>
</head>
<body>
<s:form action="login">
<table>
<tr>
<td><s:textfield name="emailid" label="Email Id"/></td>
</tr>
<tr>
<td><s:password name="pass" label="Password"/>
</tr>
<tr>
<td><s:submit value="log-in"></s:submit>
</tr>
</table>
</s:form>
</body>
</html>