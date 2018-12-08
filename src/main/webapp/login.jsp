<%@include file="head.jsp"%>
<%@include file="navBar.jsp"%>
<div id="signIn" class="tab-pane fade in active">
    <%--<img src="images/stPaulsLogo.png">--%>
    <h1>Please Login to Register</h1>

    <FORM ACTION="j_security_check" METHOD="POST">
        <TABLE>
            <TR><TD>User Name: <INPUT TYPE="TEXT" NAME="j_username">
            <TR><TD>Password: <INPUT TYPE="PASSWORD" NAME="j_password">
            <TR><TH><INPUT TYPE="SUBMIT" VALUE="Sign In">
        </TABLE>
    </FORM>
</div>