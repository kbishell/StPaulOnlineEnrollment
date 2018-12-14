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
                        <h2>Send Email</h2>
                        <div class="panel-group" id="accordionReg">
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h4 class="panel-title">
                                        <a data-toggle="collapse" data-parent="#accordionReg" href="#collapse9">Send Email to User</a>
                                    </h4>
                                </div>
                                <div id="collapse9" class="panel-collapse collapse in">
                                    <div class="panel-body">

                                        <label>Subject: </label>
                                        <input type="text" id="subject" placeholder="subject" name="subject"><br />
                                        <label>Message: </label>
                                        <textarea class="form-control" rows="5" name="message" id="message"></textarea><br />

                                    </div>
                                </div>

                            </div>
                        </div>
                    </div>
                <br />

                <button type="submit" name="submit" class="btn btn-danger btn-block">Send Email</button>
            </form>

            <a href="home.jsp"><button type="button" class="btn btn-danger btn-block">Home</button></a>
        <%@include file="footer.jsp"%>
    </div>
</body>
</html>
