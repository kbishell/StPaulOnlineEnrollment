<%@include file="head.jsp"%>
<%@include file="navBar.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Invalid Sign In</title>
</head>
<body>
    <div class="container">
        <div class="alert alert-danger" role="alert">
                <strong>Invalid username and/or password combination</strong><br />
            <a href="login.jsp"><button class="btn btn-danger btn-block">Please try again</button></a><br>
            <a href="home.jsp"><button type="button" class="btn btn-danger btn-block">Home</button></a>
        </div>
        <%@include file="footer.jsp"%>
    </div>
</body>
</html>


