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
        <li><a data-toggle="tab" href="#onecall">One Call Contacts</a></li>
        <li><a data-toggle="tab" href="#volunteer">Volunteer-Chaperones</a></li>
        <li><a data-toggle="tab" href="#childcare">Child Care</a></li>
        <li><a data-toggle="tab" href="#sports">Sports</a></li>
    </ul>

    <div class="tab-content">
        <div id="newmember" class="tab-pane fade in active">
            <h3>Sign Up</h3>
            <form action="/signup" method="get">
                Enter Your First Name: <br>
                <input type="text" id="first" placeholder="First Name" name="first"><br>
                <input type="text" id="last" placeholder="Last Name" name="last"><br>
                <input type="text" id="childname" placeholder="Child's Name" name="childname"><br>
                <input type="text" id="last" placeholder="Last Name" name="last"><br>
                <input type="text" id="last" placeholder="Last Name" name="last"><br>
                <input type="text" id="last" placeholder="Last Name" name="last"><br>
                <input type="text" id="last" placeholder="Last Name" name="last"><br>
                <input type="text" id="last" placeholder="Last Name" name="last"><br>
                <input type="text" id="last" placeholder="Last Name" name="last"><br>
                <input type="text" id="last" placeholder="Last Name" name="last"><br>
                <button type="submit" name="submit">GO</button>
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
