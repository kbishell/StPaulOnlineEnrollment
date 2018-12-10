<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 11/5/18
  Time: 3:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@include file="head.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<%@include file="head.jsp"%>
<%--<head>
    <title>Sign Up</title>
</head>--%>
<body>
    <div class="container">
        <%@include file="navBar.jsp"%>

        <h3>Sign up for an account</h3>
            <form action="signUpUser" method="post">
                <label>Username: </label>
                <input type="text" id="userName" placeholder="Username" name="userName"><br />
                <label>Password: </label>
                <input type="text" id="password" placeholder="Password" name="password"><br />
               <%-- <label> Confirm Password: </label>
                <input type="text" id="confirmPassword" placeholder="Password" name="password"><br />--%>
                <label>First Name: </label>
                <input type="text" id="firstName" placeholder="First Name" name="firstName"><br />
                <label>Last Name: </label>
                <input type="text" id="lastName" placeholder="Last Name" name="lastName"><br />
                <label>Email Address: </label>
                <input type="text" id="email" placeholder="Email Address" name="email"><br />
                <label>Cell Phone: </label>
                <input type="text" id="cellPhone" placeholder="Cell Phone" name="cellPhone"><br />
                <label>Work Phone: </label>
                <input type="text" id="workPhone" placeholder="Work Phone" name="workPhone"><br />
                <label>Relationship to Student add drop down: </label>
                <input type="text" id="relationshipToStudent" placeholder="Mother - Father - Physician" name="relationshipToStudent"><br />
                <label>Baptized: </label>
                <input type="text" id="baptized" placeholder="Y or N" name="baptized"><br />
                <%--<input type="radio" id="baptized" name="baptized" value="y"> Yes
                <input type="radio" id="baptized" name="baptized" value="n"> No<br><br>--%>
                <%--<input type="text" id="regDateOfBaptism" placeholder="Date Of Baptism" name="dateOfBaptism"><br><br><br>--%>

                <label>Employer: </label>
                <input type="text" id="employer" placeholder="Employer" name="employer"><br />
                <label>Hours Worked: </label>
                <input type="text" id="hoursWorked" placeholder="Hours Worked" name="hoursWorked"><br />
                <label>Address: </label>
                <input type="text" id="address" placeholder="Address" name="address"><br />
                <label>City: </label>
                <input type="text" id="city" placeholder="City" name="city"><br />
                <label>State: </label>
                <input type="text" id="state" placeholder="State" name="state"><br />
                <label>Zip: </label>
                <input type="text" id="zip" placeholder="ZipCode" name="zip"><br />
                <label>Date of Birth: </label>
                <input type="text" id="dob" placeholder="YYYY-MM-DD" name="dob"><br />
                <button type="submit" name="submit" class="btn btn-primary btn-lg">Submit</button>
            </form>
    </div>
</body>
</html>
