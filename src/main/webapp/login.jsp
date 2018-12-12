<!DOCTYPE html>
<html lang="en">
<%@include file="head.jsp"%>
<body>
    <div id="signIn">
        <div class="container center_div">
            <%@include file="navBar.jsp"%>
            <%--<img src="images/stPaulsLogo.png">--%>
            <h1>Please Login to Register</h1>

            <FORM class="form-inline" ACTION="j_security_check" METHOD="POST">
                <div class="form-group">
                    <TABLE>
                        <TR><TD>User Name: <INPUT TYPE="TEXT" NAME="j_username">
                        <TR><TD>Password: <INPUT TYPE="PASSWORD" NAME="j_password">
                        <TR><TH><INPUT TYPE="SUBMIT" VALUE="Sign In">
                    </TABLE>
                </div>
            </FORM>
        </div>
    </div>
</body>
</html>