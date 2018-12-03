<%@include file="head.jsp"%>

<body>

<div class="container">

    <%@include file="navBar.jsp"%>

    <div class="tab-content">
        <img src="images/stPaulsLogo.png"><br />

        <%@include file="signUpOrSignInLinks.jsp"%>

        <%@include file="preschoolRegistration.jsp"%>

        <%@include file="registration.jsp"%>

        <%--<div id="emergency" class="tab-pane fade">
            <img src="images/stPaulsLogo.png">
            <h3>Emergency Contacts</h3>
            <form action="/emergency" method="get">
                <input type="text" id="2" placeholder="Enter Last Name" name="search">
                <button type="submit" name="submit">Apply</button>
            </form>
        </div>
        <div id="health" class="tab-pane fade">
            <img src="images/stPaulsLogo.png">
            <h3>Health Concerns</h3>
            <form action="/health" method="get">
                <input type="text" id="2" placeholder="Enter Last Name" name="search">
                <button type="submit" name="submit">Apply</button>
            </form>
        </div>--%>

        <%@include file="AdminPages/admin.jsp"%>

    </div>
</div>
</body>