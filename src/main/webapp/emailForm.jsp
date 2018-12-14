<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 12/14/18
  Time: 10:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="head.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Send Email</title>
</head>
<body>

    <div class="container center_div">
        <%@include file="navBar.jsp"%>

            <form action="sendEmail" method="post">
                    <div class="form-group">
                        <h2>Sign Up to Register</h2>
                        <div class="panel-group" id="accordionReg">
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h4 class="panel-title">
                                        <a data-toggle="collapse" data-parent="#accordionReg" href="#collapse9">Sign in Credentials</a>
                                    </h4>
                                </div>
                                <div id="collapse9" class="panel-collapse collapse in">
                                    <div class="panel-body">

                                        <label>Your Name: </label>
                                        <input type="text" id="name" placeholder="your name" name="name"><br />
                                        <label>Subject: </label>
                                        <input type="text" id="subject" placeholder="subject" name="subject"><br />
                                        <label>Message: </label>
                                        <<textarea name="message" id="message" cols="30" rows="10"></textarea><br />

                                    </div>
                                </div>

                            </div>
                        </div>
                    </div>
                <br />

                <button type="submit" name="submit" class="btn btn-danger btn-block">Send Email</button>
            </form>
    </div>
</body>
</html>
