<%@include file="head.jsp"%>


<body>

<div class="container">
    <h2>Members Information</h2>

    <ul class="nav nav-tabs">
        <li class="active"><a data-toggle="tab" href="#home">Home</a></li>
        <li><a data-toggle="tab" href="#signIn">Sign In</a></li>
        <li><a data-toggle="tab" href="#newMember">New Members</a></li>
        <li><a data-toggle="tab" href="#pre">Pre-School Registration</a></li>
        <li><a data-toggle="tab" href="#reg">K-8 Registration</a></li>
        <li><a data-toggle="tab" href="#emergency">Emergency Contacts</a></li>
        <li><a data-toggle="tab" href="#health">Health Concerns</a></li>
        <li><a data-toggle="tab" href="#oneCall">One Call Contacts</a></li>
        <li><a data-toggle="tab" href="#volunteer">Volunteer-Chaperones</a></li>
        <li><a data-toggle="tab" href="#childcare">Child Care</a></li>
        <li><a data-toggle="tab" href="#sports">Sports</a></li>
    </ul>

    <div class="tab-content">
        <div id="home" class="tab-pane fade in active">
            <h1>St Paul's Lutheran Online Registration</h1>
            <form action="/home" method="get">
                <button type="submit" name="submit">Your Account</button>
                <button type="submit" name="submit">Sign Up</button>
            </form>
        </div>
        <div id="signIn" class="tab-pane fade">
            <h3>Access Your Account</h3>
            <form action="/signIn" method="get">
                <input type="text" id="username" placeholder="Username" name="username">
                <input type="text" id="password" placeholder="Password" name="password">
                <button type="submit" name="submit">Sign In</button>
            </form>
        </div>
        <div id="newMember" class="tab-pane fade">
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

                <button type="submit" name="submit">Enter Another Child</button><br><br>

                <button type="submit" name="submit">GO</button><br><br>

                <p id="registrationFee">Non-refundable Registration Fee $70.00. Return registration fee with this form to secure your
                   place. You will recieve an email confirming your child's enrollment</p>
            </form>
        </div>
        <div id="pre" class="tab-pane fade">
            <h3>Pre-School Registration</h3>
            <form action="/pre" method="get">
                <input type="text" id="" placeholder="Enter Last Name" name="search">
                <button type="submit" name="submit">Apply</button>
            </form>
        </div>
        <div id="reg" class="tab-pane fade">
            <h3>K-8 Registration</h3>
            <form action="/reg" method="get">
                <input type="text" id="2" placeholder="Enter Last Name" name="search">
                <button type="submit" name="submit">Apply</button>
            </form>
        </div>
        <div id="emergency" class="tab-pane fade">
            <h3>Emergency Contacts</h3>
            <form action="/emergency" method="get">
                <input type="text" id="2" placeholder="Enter Last Name" name="search">
                <button type="submit" name="submit">Apply</button>
            </form>
        </div>
        <div id="health" class="tab-pane fade">
            <h3>Health Concerns</h3>
            <form action="/health" method="get">
                <input type="text" id="2" placeholder="Enter Last Name" name="search">
                <button type="submit" name="submit">Apply</button>
            </form>
        </div>
    </div>
</div>
