<%@include file="head.jsp"%>


<body>

<div class="container">
    <h2>Members Information</h2>

    <ul class="nav nav-tabs">
        <li class="active"><a data-toggle="tab" href="#newmember">New Members</a></li>
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
        <div id="newMember" class="tab-pane fade in active">
            <h3>Sign Up</h3>
            <form action="/signup" method="get">
                <input type="text" id="childName" placeholder="Child's Name" name="childName">
                <input type="radio" id="male" name="gender" value="male"> Male
                <input type="radio" id="female" name="gender" value="female"> Female<br>
                <input type="text" id="dob" placeholder="Date of Birth" name="dob"><br>
                <input type="text" id="address" placeholder="Address" name="address"><br>
                <input type="text" id="city" placeholder="City" name="city"><br>
                <input type="text" id="state" placeholder="State" name="state"><br>
                <input type="text" id="zip" placeholder="zip" name="zip"><br>
                <input type="text" id="affiliation" placeholder="Church Affiliation" name="affiliation"><br>
                Baptized: <input type="radio" id="yesBaptized" name="yes" value="yes"> Yes
                <input type="radio" id="noBaptized" name="no" value="no"> No<br>
                <button type="submit" name="submit">GO</button>

                <p>Non-refundable Registration Fee $70.00. Return registration fee with this form to secure your
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
        <div id="menu2" class="tab-pane fade">
            <h3>Menu 2</h3>
            <form action="/register" method="get">
                <input type="text" id="2" placeholder="Enter Last Name" name="search">
                <button type="submit" name="submit">Apply</button>
            </form>
        </div>
        <div id="menu2" class="tab-pane fade">
            <h3>Menu 2</h3>
            <form action="/register" method="get">
                <input type="text" id="2" placeholder="Enter Last Name" name="search">
                <button type="submit" name="submit">Apply</button>
            </form>
        </div>
        <div id="menu2" class="tab-pane fade">
            <h3>Menu 2</h3>
            <form action="/register" method="get">
                <input type="text" id="2" placeholder="Enter Last Name" name="search">
                <button type="submit" name="submit">Apply</button>
            </form>
        </div>
    </div>
</div>
