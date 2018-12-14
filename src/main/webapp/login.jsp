<!DOCTYPE html>
<html lang="en">
<%@include file="head.jsp"%>
<body>
    <div id="signIn">
        <div class="container center_div">
            <%@include file="navBar.jsp"%>
            <%--<img src="images/stPaulsLogo.png">--%>
            <h1>Please Login to Register</h1>

            <FORM ACTION="j_security_check" METHOD="POST">
                <div class="form-group">
                    <TABLE>
                        <TR><TD>User Name: <INPUT TYPE="TEXT" NAME="j_username">
                        <TR><TD>Password: <INPUT TYPE="PASSWORD" NAME="j_password">
                        <%--<TR><TH><INPUT TYPE="SUBMIT" VALUE="Sign In">--%>
                        <TR><TH><button  TYPE="SUBMIT" VALUE="Sign In" class="btn btn-danger btn-block">Submit</button>
                    </TABLE>
                </div>
            </FORM>
        </div>
    </div>
</body>
</html>