<%--
  Created by IntelliJ IDEA.
  User: VanTT
  Date: 12/23/19
  Time: 2:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new Employee</title>
</head>
<body>
<h2>Create new Employee</h2>
<form:form method="post" action="addEmployee" modelAttribute="employee">
    EmployeeID: <form:input path="id"/> <br/>
    Employee's name: <form:input path="name"/> <br/>
    Contact's number: <form:input path="contactNumber"/> <br/>
    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>
