<%@include file="head.jsp"%>
<%@include file="navBar.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Invalid Sign In</title>
</head>
<body>

    <div class="alert alert-danger" role="alert">
        <div class="container">
            <strong>Invalid userid and/or password combination</strong>
        </div><br />
        <a href="login.jsp"><button class="btn btn-primary">Please try again</button></a>
    </div>
</body>
</html>


