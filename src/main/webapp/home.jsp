    <div class="tab-content">
        <div id="home" class="tab-pane fade in active">
            <img src="stPaulsLogo.png">
            <h1>St Paul's Lutheran Online Registration</h1>
            <%--<form action="/home" method="get">
                <button type="submit" name="submit">Your Account</button>
                <button type="submit" name="submit">Sign Up</button>
            </form>--%>
            <FORM ACTION="j_security_check" METHOD="POST">
                <TABLE>
                    <TR><TD>User Name: <INPUT TYPE="TEXT" NAME="j_username">
                    <TR><TD>Password: <INPUT TYPE="PASSWORD" NAME="j_password">
                    <TR><TH><INPUT TYPE="SUBMIT" VALUE="Log In">
                </TABLE>
            </FORM>
        </div>
    </div>