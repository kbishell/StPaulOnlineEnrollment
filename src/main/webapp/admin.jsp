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
                <h3>Admin use ONLY</h3>
                <h2>Search Users</h2>
                <form action="searchUser" method="post">
                    <div class="form-group">
                        <label for="search">Search By Last Name: </label>
                        <input type="text" id="search" placeholder="Enter Last Name" name="search">
                        <button type="submit" name="submit" value="search" class="btn btn-danger btn-lg">Submit</button><br><br>
                        <button type="submit" name="submit" value="viewAll" class="btn btn-danger btn-block">View All Users</button>
                    </div>
                </form>

                <%@include file="footer.jsp"%>
            </div>
        </div>
    </body>
</html>
