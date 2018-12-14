<!DOCTYPE html>
<html lang="en">
<%@include file="head.jsp"%>
<body>
    <div class="container center_div">
        <%@include file="navBar.jsp"%>

        <h1>Please Login to Register</h1>

        <FORM ACTION="j_security_check" METHOD="POST">
            <div>
                <TABLE>
                    <TR><TD>User Name: <INPUT TYPE="TEXT" NAME="j_username">
                    <TR><TD>Password: <INPUT TYPE="PASSWORD" NAME="j_password">
                    <%--<TR><TH><INPUT TYPE="SUBMIT" VALUE="Sign In">--%>
                    <TR><TH><button  TYPE="SUBMIT" VALUE="Sign In" class="btn btn-danger btn-block">Sign In</button>
                </TABLE>
            </div>
        </FORM>
        <%@include file="footer.jsp"%>
    </div>
</body>
</html>