<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 11/5/18
  Time: 3:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<%@include file="head.jsp"%>
<%--<head>
    <title>Sign Up</title>
</head>--%>
<body>
    <div class="container center_div">
        <%@include file="navBar.jsp"%>

        <h3>Sign up for an account</h3>

        <form action="signUpUser" method="post">
            <div class="form-group">
                <h2>Sign Up to Register</h2>
                <div class="panel-group" id="accordionReg">
                        <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h4 class="panel-title">
                                        <a data-toggle="collapse" data-parent="#accordionReg" href="#collapse7">Sign in Credentials</a>
                                    </h4>
                                </div>
                                <div id="collapse7" class="panel-collapse collapse in">
                                    <div class="panel-body">

                                        <label>Username: </label>
                                        <input type="text" id="userName" placeholder="Username" name="userName"><br />
                                        <label>Password: </label>
                                        <input type="text" id="password" placeholder="Password" name="password"><br />
                                        <label> Confirm Password: </label>
                                        <input type="text" id="confirmPassword" placeholder="Password" name="password"><br />

                                </div>
                            </div>
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h4 class="panel-title">
                                        <a data-toggle="collapse" data-parent="#accordionReg" href="#collapse8">Contact Information</a>
                                    </h4>
                                </div>
                                <div id="collapse8" class="panel-collapse collapse">
                                    <div class="panel-body">

                                        <label>First Name: </label>
                                        <input type="text" id="firstName" placeholder="First Name" name="firstName"><br />
                                        <label>Last Name: </label>
                                        <input type="text" id="lastName" placeholder="Last Name" name="lastName"><br />
                                        <label>Email Address: </label>
                                        <input type="text" id="emailAddress" placeholder="Email Address" name="emailAddress"><br />
                                        <label>Cell Phone: </label>
                                        <input type="text" id="cellPhone" placeholder="Cell Phone" name="cellPhone"><br />
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
                                        <label>Relationship to Student: </label>
                                        <input type="text" id="relationshipToStudent" placeholder="Mother - Father - Physician" name="relationshipToStudent"><br />
                                        <label>Baptized: </label>
                                        <input type="text" id="baptized" placeholder="Y or N" name="baptized"><br />

                                </div>
                            </div>
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h4 class="panel-title">
                                        <a data-toggle="collapse" data-parent="#accordionReg" href="#collapse6">Work Information</a>
                                    </h4>
                                </div>
                                <div id="collapse6" class="panel-collapse collapse">
                                    <div class="panel-body">
                                        <label>Employer: </label>
                                        <input type="text" id="employer" placeholder="Employer" name="employer"><br />
                                        <label>Work Phone: </label>
                                        <input type="text" id="workPhone" placeholder="Work Phone" name="workPhone"><br />
                                        <label>Hours Worked: </label>
                                        <input type="text" id="hoursWorked" placeholder="Hours Worked" name="hoursWorked"><br /><br />
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div><br />

                <button type="submit" name="submit" class="btn btn-danger btn-lg">Submit</button>
            </div>
        </form>
    </div>

</body>
</html>
