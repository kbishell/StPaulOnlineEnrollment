<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@include file="head.jsp"%>

<body>

    <h2>Sign up Confirmation</h2>

    <div class="container theme-showcase" role="main">

        <c:choose>
            <c:when test = "${errorMessage == null}">
                <div class="alert alert-success" role="alert">
                    <strong>New User Registration -- Success</strong>
                </div>
            </c:when>
            <c:otherwise>
                <div class="alert alert-danger" role="alert">
                    <strong>New User Registration -- Failed</strong>$<br />
                    {errorMessage}<br /><br />
                    <a href="signUp.jsp"><button type="button" class="btn btn-primary">
                        Retry</button></a>
                    <a href="viewTrails"><button type="button" class="btn btn-default">Cancel

                </div>
            </c:otherwise>
        </c:choose>



    </div>

</body>
</html>