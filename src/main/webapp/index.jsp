<%@include file="head.jsp"%>

<body>

<div class="container">
    <%--<h2>Members Information</h2>--%>
<%--
    <ul class="nav nav-tabs">
        <li class="active"><a data-toggle="tab" href="#home">Home</a></li>
        <li><a data-toggle="tab" href="#signUp">Sign Up</a></li>
        <li><a data-toggle="tab" href="#newMember">New Members</a></li>
        <li><a data-toggle="tab" href="#pre">Pre-School Registration</a></li>
        <li><a data-toggle="tab" href="#reg">K-8 Registration</a></li>
        <li><a data-toggle="tab" href="#emergency">Emergency Contacts</a></li>
        <li><a data-toggle="tab" href="#health">Health Concerns</a></li>
        <li><a data-toggle="tab" href="#oneCall">One Call Contacts</a></li>
        <li><a data-toggle="tab" href="#volunteer">Volunteer-Chaperones</a></li>
        <li><a data-toggle="tab" href="#childcare">Child Care</a></li>
        <li><a data-toggle="tab" href="#sports">Sports</a></li>
    </ul>--%><%@include file="navBar.jsp"%>

    <div class="tab-content">
        <img src="images/stPaulsLogo.png"><br />
        <a href="registration.jsp">Sign In</a><br /><br />
        <a href="signUp.jsp">Sign Up</a>
<%--
        <div id="home" class="tab-pane fade in active">
            <img src="images/stPaulsLogo.png">
            <h1>St Paul's Lutheran Online Registration</h1>
            <FORM ACTION="j_security_check" METHOD="POST">
                <TABLE>
                    <TR><TD>User Name: <INPUT TYPE="TEXT" NAME="j_username">
                    <TR><TD>Password: <INPUT TYPE="PASSWORD" NAME="j_password">
                    <TR><TH><INPUT TYPE="SUBMIT" VALUE="Log In">
                </TABLE>
            </FORM>
        </div>--%>


       <%-- <div id="signUp" class="tab-pane fade">
            <img src="images/stPaulsLogo.png">
            <h3>Sign up for an account</h3>
            <form action="/signUpUser" method="get">
                <input type="text" id="userName" placeholder="Username" name="userName">
                <input type="text" id="password" placeholder="Password" name="password">
                <input type="text" id="firstName" placeholder="First Name" name="firstName">
                <input type="text" id="lastName" placeholder="Last Name" name="lastName">
                <input type="text" id="emailAddress" placeholder="Email Address" name="emailAddress">
                <button type="submit" name="submit">Sign In</button>
            </form>
        </div>--%>

        <div id="newMember" class="tab-pane fade">
            <img src="images/stPaulsLogo.png">
            <h1>Sign Up</h1><br><br>

            <form action="/newMember" method="get">

                <h2>Father's Information</h2>
                <input type="text" id="fatherName" placeholder="Father's Name" name="fatherName"><br><br>
                <input type="text" id="fatherAddress" placeholder="Father's Address" name="fatherAddress"><br><br>
                <input type="text" id="fatherOccupation" placeholder="Father's Occupation" name="fatherOccupation"><br><br>
                <input type="text" id="fatherAffiliation" placeholder="Church Affiliation" name="fatherAffiliation"><br><br><br>
                Baptized: <input type="radio" id="fatherBaptized" name="fatherBaptized" value="yes"> Yes
                <input type="radio" id="fatherNotBaptized" name="fatherNotBaptized" value="no"> No<br><br>

                <h2>Mother's Information</h2>
                <input type="text" id="motherName" placeholder="Mother's Name" name="motherName"><br><br>
                <input type="text" id="motherAddress" placeholder="Mother's Address" name="motherAddress"><br><br>
                <input type="text" id="motherOccupation" placeholder="Mother's Occupation" name="motherOccupation"><br><br>
                <input type="text" id="motherAffiliation" placeholder="Church Affiliation" name="affiliation"><br><br><br>
                Baptized: <input type="radio" id="motherBaptized" name="motherBaptized" value="yes"> Yes
                <input type="radio" id="motherNotBaptized" name="motherNotBaptized" value="no"> No<br><br>

                <h2>Child(ren) Information</h2>
                <input type="text" id="childName" placeholder="Child's Name" name="childName">
                <input type="radio" id="male" name="gender" value="male"> Male
                <input type="radio" id="female" name="gender" value="female"> Female<br><br>
                <input type="text" id="age" placeholder="Age" name="age"><br><br>
                <input type="text" id="grade" placeholder="Grade" name="grade"><br><br>
                <input type="text" id="dob" placeholder="Date of Birth" name="dob"><br><br>
                <input type="text" id="address" placeholder="Address" name="address"><br><br>
                <input type="text" id="city" placeholder="City" name="city"><br><br>
                <input type="text" id="state" placeholder="State" name="state"><br><br>
                <input type="text" id="zip" placeholder="zip" name="zip"><br><br>
                <input type="text" id="email" placeholder="email" name="email"><br><br>

                Baptized: <input type="radio" id="childBaptized" name="childBaptized" value="yes"> Yes
                <input type="radio" id="childNotBaptized" name="childNotBaptized" value="no"> No<br><br>

                <input type="text" id="previousSchool" placeholder="Previous Schools" name="previousSchool"><br><br>
                <input type="text" id="previousSchoolGrade" placeholder="Grade" name="previousSchoolGrade"><br><br>
                <input type="text" id="previousSchoolYears" placeholder="Years" name="previousSchoolYears"><br><br>
                <button type="submit" name="submit">Add Another School</button><br><br>

                <button type="submit" name="submit">Enter Another Child</button><br><br>

                <button type="submit" name="submit">GO</button><br><br>

                <p id="registrationFee">Non-refundable Registration Fee $70.00. Return registration fee with this form to secure your
                   place. You will recieve an email confirming your child's enrollment</p>
            </form>
        </div>
        <div id="pre" class="tab-pane fade">
            <img src="images/stPaulsLogo.png">
            <h3>Pre-School Registration</h3>

            <form action="/pre" method="get">
                <h3>Half-Day 3K</h3>

                <input type="checkbox" id="3kHalf" name="3kHalf" value="Half-Day 3K">Half-Day 3K (7:30am - 11:00am)<br><br>
                    <input type="checkbox" id="MT3k" name="MT3k" value="Monday and Tuesday $120 per month">Monday and Tuesday $120 per month<br>
                    <input type="checkbox" id="MTF3k" name="MTF3k" value="Monday, Thursday, and Friday $180 per month">Monday, Thursday, and Friday $180 per month<br>
                    <input type="checkbox" id="childcare3kHalf" name="childcare3kHalf" value="Childcare on regular sessions days (11:00am - 3:00pm) $15 per day">Childcare on regular sessions days (11:00am - 3:00pm) $15 per day<br>

                <h3>Half-Day 4K</h3>
                <input type="checkbox" id="4kHalf" name="4kHalf" value="Half-Day 4K">Half-Day 4K (7:30am - 11:00am)<br><br>
                    <input type="checkbox" id="childcare4khalf" name="childcare4khalf" value="Childcare on regular session days (11:00am-3:00pm) $15 per day">Childcare on regular session days (11:00am-3:00pm) $15 per day<br><br>

                    <p>Before care included in prices for half-day programs (6:30am - 7:30am)</p><br><br>

                <h3>Full-Day 4K&3K</h3>
                <input type="checkbox" id="allFull" name="allFull" value="Full-Day 3K and 4K">Full-Day 3K and 4K --- Mixed Ages(7:30am - 3:00pm)<br><br>

                    <p>$125 per week - before and after school care included in weekly price (6:30am - 7:30am) - (3:00pm - 6:00pm)</p><br>

                    <input type="checkbox" id="MWFull" name="MWFull" value="Monday - Wednesday">Monday - Wednesday<br>
                    <input type="checkbox" id="MTFull" name="MTFull" value="Monday - Thursday">Monday - Thursday<br>
                    <input type="checkbox" id="MFFull" name="MFFull" value="Monday - Friday">Monday - Friday<br><br>

                <button type="submit" name="submit">Apply</button>

            </form>
        </div>
        <div id="reg" class="tab-pane fade">
            <img src="images/stPaulsLogo.png">
            <h3>K-8 Registration</h3>

            <form action="/reg" method="get">

                <h2>Father's Information</h2>
                <input type="text" id="regFatherName" placeholder="Father's Name" name="fatherName"><br><br>
                <input type="text" id="regFatherAddress" placeholder="Father's Address" name="fatherAddress"><br><br>
                <input type="text" id="regFatherEmployer" placeholder="Father's Employe" name="fatherEmployer"><br><br>
                <input type="text" id="regFatherPlaceOfBirth" placeholder="Father's Place of Birth" name="fatherPlaceOfBirth"><br><br>
                <input type="text" id="regFatherPhone" placeholder="Father Phone" name="fatherPhone"><br><br>
                <input type="text" id="regFatherWorkPhone" placeholder="Father Work Phone" name="fatherWorkPhone"><br><br>
                <input type="text" id="regFatherAffiliation" placeholder="Church Affiliation" name="fatherAffiliation"><br><br>

                <h2>Mother's Information</h2>
                <input type="text" id="regMotherName" placeholder="Mother's Name" name="motherName"><br><br>
                <input type="text" id="regMotherAddress" placeholder="Mother's Address" name="motherAddress"><br><br>
                <input type="text" id="regMotherEmployer" placeholder="Mother's Employe" name="motherEmployer"><br><br>
                <input type="text" id="regMotherPlaceOfBirth" placeholder="Mother's Place of Birth" name="motherPlaceOfBirth"><br><br>
                <input type="text" id="regMotherPhone" placeholder="Mother Phone" name="motherPhone"><br><br>
                <input type="text" id="regMotherWorkPhone" placeholder="Mother Work Phone" name="motherWorkPhone"><br><br>
                <input type="text" id="regMotherAffiliation" placeholder="Church Affiliation" name="affiliation"><br><br>

                <h2>Child(ren) Information</h2>
                <input type="text" id="regChildName" placeholder="Child's Name" name="childName"><br><br>
                <input type="text" id="regPhone" placeholder="Phone Number" name="phone"><br><br>
                <input type="text" id="regGrade" placeholder="Grade" name="grade"><br><br>
                <input type="text" id=regYears" placeholder="Age: Years" name="years"><br><br>
                <input type="text" id="regMonths" placeholder="Age: months" name="months"><br><br>
                <input type="text" id="regAddress" placeholder="Address" name="address"><br><br>
                <input type="text" id="regCity" placeholder="City" name="city"><br><br>
                <input type="text" id="regState" placeholder="State" name="state"><br><br>
                <input type="text" id="regZip" placeholder="zip" name="zip"><br><br>
                <input type="text" id="regEmail" placeholder="email" name="email"><br><br>
                <input type="text" id="regPastor" placeholder="Pastor" name="pastor"><br><br>
                <input type="text" id="regChurch" placeholder="Church" name="church"><br><br>
                <input type="text" id="regDob" placeholder="Date of Enrollment" name="deo"><br><br><br>

                Baptized: <input type="radio" id="regChildBaptized" name="childBaptized" value="yes"> Yes
                <input type="radio" id="regChildNotBaptized" name="childNotBaptized" value="no"> No<br><br>
                <input type="text" id="regDateOfBaptism" placeholder="Date Of Baptism" name="dateOfBaptism"><br><br><br>


                <input type="text" id="regOtherChildren" placeholder="List other children in your family" name="otherChildren"><br><br>
                <input type="text" id="regFirstName" placeholder="First Name" name="firstName"><br><br>
                <input type="text" id="regLastName" placeholder="Last Name" name="lastName"><br><br><br>

                <input type="text" id="regComments" placeholder="Comments:" name="comments"><br><br><br>

                <button type="submit" name="submit">Enter Another Child</button><br><br>

                <button type="submit" name="submit">Apply</button>
            </form>
        </div>
        <div id="emergency" class="tab-pane fade">
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
        </div>

        <%@include file="AdminPages/admin.jsp"%>

    </div>
</div>
</body>