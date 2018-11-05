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
        <img src="images/stPaulsLogo.png">
        <h3>Admin</h3>
        <form action="searchUser" method="get">
            <input type="text" id="search" placeholder="Enter Last Name" name="search">
            <button type="submit" name="submit">Submit</button>
        </form>
    </div>
</body>
</html>
