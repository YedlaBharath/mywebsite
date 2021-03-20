<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Registration Form</title>
</head>
<body>
<h2>Please Enter Your details to Register.</h2>
    <s:form action="registrations">
        <table id="t1">
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
            <tr><td id="s1"><s:submit value="submit"/></td></tr>
        </table>
    </s:form>
</body>
</html>
