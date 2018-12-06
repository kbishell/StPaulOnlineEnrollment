<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 11/5/18
  Time: 1:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin Functions</title>
</head>
    <body>
        <div id="adminOnly" class="tab-pane fade">
            <h3 class="centered">Admin use ONLY</h3>
            <h2 class="centered">Search Users</h2>
            <form action="searchUser" method="post">
                <label for="search">Search By Last Name: </label>
                <input type="text" id="search" placeholder="Enter Last Name" name="search">
                <button type="submit" name="submit" value="search" class="btn btn-primary">Submit</button>
                <button type="submit" name="submit" value="viewAll" class="btn btn-primary">View All Users</button>
            </form>
        </div>
    </body>
</html>
