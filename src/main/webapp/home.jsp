<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 12/3/18
  Time: 11:07 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="head.jsp"%>
<!DOCTYPE html>
<html lang="en">
<%--<head>
    <title>Sign Up or Sign In</title>
</head>--%>
<body>
        <div id="home">
            <div class="container center_div">
                <%@include file="navBar.jsp"%>
                <a href="registration.jsp"><button type="submit" name="submit" class="btn btn-danger btn-block">Sign In</button></a>
                <a href="signUp.jsp"><button type="submit" name="submit" class="btn btn-default btn-block">Sign Up</button></a>
            </div>
        </div>
</body>
</html>
