<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 11/5/18
  Time: 3:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@include file="head.jsp"%>
<%@include file="navBar.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign Up</title>
</head>
<body>
    <h3>Sign up for an account</h3>
    <form action="/signUpUser" method="get">
        <input type="text" id="userName" placeholder="Username" name="userName">
        <input type="text" id="password" placeholder="Password" name="password">
        <input type="text" id="firstName" placeholder="First Name" name="firstName">
        <input type="text" id="lastName" placeholder="Last Name" name="lastName">
        <input type="text" id="emailAddress" placeholder="Email Address" name="emailAddress">
        <button type="submit" name="submit">Sign In</button>
    </form>
</body>
</html>
