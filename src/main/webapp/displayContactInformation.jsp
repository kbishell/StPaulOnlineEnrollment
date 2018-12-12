<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="head.jsp"%>

<html><body>

<div class="container">
    <%@include file="navBar.jsp"%>
    <h2>Contact Information</h2>

    <table class="table">

        <tr>
            <th>First Name</th>
            <th>Last Name</th>
        </tr>

        <%--<c:forEach var="contact" items="${contact}">--%>
        <tr>
            <td>${contact.firstName}</td>
            <td>${contact.lastName}</td>
        </tr>


    </table>
</div>

</body>
</html>
