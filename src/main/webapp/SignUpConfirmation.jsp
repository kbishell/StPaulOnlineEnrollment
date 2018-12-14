<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<%@include file="head.jsp"%>

<body>

    <div class="container center_div">
        <%@include file="navBar.jsp"%>

            <h2>Sign up Confirmation</h2>

            <div>

                <c:choose>
                    <c:when test = "${errorMessage == null}">
                        <div class="alert alert-success" role="alert">
                            <strong>New User Registration -- Success</strong> Time to register your student
                        </div>
                    </c:when>

                    <c:otherwise>
                        <div class="alert alert-danger" role="alert">
                            <strong>New User Registration -- Failed</strong>$<br />
                            {errorMessage}<br /><br />
                            <a href="signUp.jsp"><button type="button" class="btn btn-danger btn-lg">Retry</button></a>
                        </div>
                    </c:otherwise>
                </c:choose>

                <a href="home.jsp"><button type="button" class="btn btn-danger btn-lg">Home</button></a>
                <%--<a href="signUp.jsp"><button type="button" class="btn btn-danger btn-lg">Back</button></a>--%>
            </div>
    </div>
</body>
</html>
