<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 11/5/18
  Time: 1:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="head.jsp"%>
<html>
<head>
    <title>Admin Functions</title>
</head>
<body>
    <div id="adminOnly" >
        <div class="container">
            <%@include file="navBar.jsp"%>
            <h2>Account Information</h2>
            <form action="viewContactInformation" method="post" class="form-inline">
                <div class="form-group">
                    <label>Your Contact Information: </label><br>
                    <button type="submit" name="submit" value="viewAll" class="btn btn-danger btn-lg">view</button>
                </div>
            </form>
            <a href="home.jsp"><button type="button" class="btn btn-danger btn-block">Home</button></a><br>
            <a href="home.jsp"><button type="button" class="btn btn-danger btn-block">Back</button></a>

            <%@include file="footer.jsp"%>
        </div>
    </div>
</body>
</html>