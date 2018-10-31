<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"><%--
  Created by IntelliJ IDEA.
  User: student
  Date: 10/31/18
  Time: 12:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Users</title>
</head>
<body>

    <h2>User Information</h2>

    <c:choose>
        <c:when test="${empty users}">
            <h3>Currently, there are no users.</h3>
        </c:when>
        <c:otherwise>
            <table id="users">

                <tr>
                    <td>Employee Id:</td><td>${users.emp_id}</td>
                </tr>

                <tr>
                    <td>Name:</td><td>${users.emp_name}</td>
                </tr>

                <tr>
                    <td>Email Address:</td><td>${users.emp_email}</td>
                </tr>

                <tr>
                    <td>Phone No.:</td><td>${users.emp_phone}</td>
                </tr>
            </table>
        </c:otherwise>
    </c:choose>
</body>
</html>
