<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@include file="head.jsp"%>

<body>
<%@include file="navBar.jsp"%>

    <h2>Sign up Confirmation</h2>

    <div>

        <c:choose>

            <c:when test = "${errorMessage == null}">
                <div class="centered" class="alert alert-success" role="alert">
                    <strong>New User Registration -- Success</strong> Time to register your student
                </div>
            </c:when>

            <c:otherwise>
                <div class="centered" class="alert alert-danger" role="alert">
                    <strong>New User Registration -- Failed</strong>$<br />
                    {errorMessage}<br /><br />
                    <a href="signUp.jsp"><button type="button" class="btn btn-primary">Retry</button></a>
                    <%--<a href="signIn"><button type="button" class="btn btn-default">Sign In</button></a>--%>
                </div>
            </c:otherwise>

        </c:choose>


    </div>

</body>
</html>
