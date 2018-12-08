<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 11/5/18
  Time: 3:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@include file="head.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign Up</title>
</head>
<body>
    <div class="container">
        <%@include file="navBar.jsp"%>

        <h3>Sign up for an account</h3>
            <form action="signUpUser" method="post">
                <label>Username: </label>
                <input type="text" id="userName" placeholder="Username" name="userName"><br />
                <label>Password: </label>
                <input type="text" id="password" placeholder="Password" name="password"><br />
                <label> Confirm Password: </label>
                <input type="text" id="confirmPassword" placeholder="Password" name="password"><br />
                <label>First Name: </label>
                <input type="text" id="firstName" placeholder="First Name" name="firstName"><br />
                <label>Last Name: </label>
                <input type="text" id="lastName" placeholder="Last Name" name="lastName"><br />
                <label>Email Address: </label>
                <input type="text" id="emailAddress" placeholder="Email Address" name="emailAddress"><br />
                <button type="submit" name="submit" class="btn btn-primary">Submit</button>
            </form>
    </div>
</body>
</html>
