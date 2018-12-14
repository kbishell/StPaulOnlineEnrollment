<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 12/3/18
  Time: 11:07 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="head.jsp"%>
<!DOCTYPE html>
<html lang="en">
<%--<head>
    <title>Sign Up or Sign In</title>
</head>--%>
<body>
        <div id="home">
            <div class="container center_div">
                <%@include file="navBar.jsp"%>
                <a href="registration.jsp"><button type="submit" name="submit" class="btn btn-danger btn-block">Sign In</button></a><br>
                <a href="signUp.jsp"><button type="submit" name="submit" class="btn btn-default btn-block">Sign Up</button></a><br><br>

                <p id="registrationFee">
                    There is a <strong>non-refundable</strong> Registration Fee $70.00. Return registration fee with this form to secure your
                    place. You will recieve an email confirming your child's enrollment
                </p>

                <%@include file="footer.jsp"%>
            </div>
        </div>
</body>
</html>
