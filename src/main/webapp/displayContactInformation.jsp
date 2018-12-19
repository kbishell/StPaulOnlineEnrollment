<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="head.jsp"%>

<html><body>

<div class="container">
    <%@include file="navBar.jsp"%>
    <h2>Contact Information</h2>

    <table class="table">
        <tr>
            <th>First Name</th>
            <td>${contact.firstName}</td>
        </tr>
        <tr>
            <th>Last Name</th>
            <td>${contact.lastName}</td>
        </tr>
        <tr>
            <th>Relationship To Student</th>
            <td>${contact.relationshipToStudent}</td>
        </tr>
        <tr>
            <th>Email</th>
            <td>${contact.email}</td>
        </tr>
        <tr>
            <th>Cell Phone</th>
            <td>${contact.cellPhone}</td>
        </tr>
        <tr>
            <th>Employer</th>
            <td>${contact.employer}</td>
        </tr>
        <tr>
            <th>Work Phone</th>
            <td>${contact.workPhone}</td>
        </tr>
        <tr>
            <th>Hours Worked</th>
            <td>${contact.hoursWorked}</td>
        </tr>
        <tr>
            <th>Address</th>
            <td>${contact.address}</td>
        </tr>
        <tr>
            <th>City</th>
            <td>${contact.city}</td>
        </tr>
        <tr>
            <th>State</th>
            <td>${contact.state}</td>
        </tr>
        <tr>
            <th>Zip</th>
            <td>${contact.zip}</td>
        </tr>
        <tr>
            <th>Baptized</th>
            <td>${contact.baptized}</td>
        </tr>

    </table><br>

    <a href="updateContact.jsp"><button type="submit" name="submit" class="btn btn-danger btn-block">Update</button></a><br><br>
    <a href="home.jsp"><button type="submit" name="submit" class="btn btn-danger btn-block">Delete</button></a><br>
    <a href="home.jsp"><button type="submit" name="submit" class="btn btn-danger btn-block">Home</button></a><br>

    <%@include file="footer.jsp"%>

</div>

</body>
</html>
