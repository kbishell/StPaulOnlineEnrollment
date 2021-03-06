<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="head.jsp"%>

<html><body>

<div class="container">
    <%@include file="navBar.jsp"%>
    <h2>Users Search Results</h2>

    <table class="table">

        <tr>
            <th>First Name</th>
            <th>Last Name</th>
            <th>User Name</th>
            <th>Email</th>
        </tr>

        <c:forEach var="user" items="${users}">
            <tr>

                <td>${user.firstName}</td>
                <td>${user.lastName}</td>
                <td>${user.userName}</td>
                <td>${user.emailAddress}</td>

            </tr>
        </c:forEach>

    </table>
    <a href="home.jsp"><button type="submit" name="submit" class="btn btn-danger btn-block">Home</button></a><br>
    <a href="admin.jsp"><button type="submit" name="submit" class="btn btn-danger btn-block">Back</button></a>

    <%@include file="footer.jsp"%>
</div>

</body>
</html>
