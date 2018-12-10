<!DOCTYPE html>
<html lang="en">
<%@include file="head.jsp"%>
<body>
    <div id="signIn" class="tab-pane fade in active">
        <div class="container center_div">
            <%@include file="navBar.jsp"%>
            <%--<img src="images/stPaulsLogo.png">--%>
            <h1>Please Login to Register</h1>

            <FORM class="form-horizontal" ACTION="j_security_check" METHOD="POST">
                <TABLE>
                    <TR><TD>User Name: <INPUT TYPE="TEXT" NAME="j_username">
                    <TR><TD>Password: <INPUT TYPE="PASSWORD" NAME="j_password">
                    <TR><TH><INPUT TYPE="SUBMIT" VALUE="Sign In">
                </TABLE>
            </FORM>
        </div>
    </div>
</body>
</html>