<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 12/14/18
  Time: 10:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<%@include file="head.jsp"%>
<html lang="en">
<head>
    <title>Confirm Email</title>
</head>
<body>
    <div class="container center_div">
        <%@include file="navBar.jsp"%>

        <h2>Confirm Email</h2>

        <div>
            <c:choose>
                <c:when test = "${errorMessage == null}">
                    <div class="alert alert-success" role="alert">
                        <strong>Your email has successfully sent!</strong>
                        <a href="home.jsp"><button type="button" class="btn btn-danger btn-lg">Home</button></a>
                    </div>
                </c:when>

                <c:otherwise>
                    <div class="alert alert-danger" role="alert">
                        <strong>Email failed to send</strong>$<br />
                        {errorMessage}<br /><br />
                        <a href="emailForm.jsp"><button type="button" class="btn btn-danger btn-lg">Retry</button></a><br>

                        <a href="home.jsp"><button type="button" class="btn btn-danger btn-lg">Home</button></a><br>
                    </div>
                </c:otherwise>
            </c:choose>
        </div>
        <%@include file="footer.jsp"%>
    </div>
</body>
</html>
