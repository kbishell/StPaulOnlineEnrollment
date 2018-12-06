<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 11/5/18
  Time: 3:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="head.jsp"%>
<html>
<head>
    <title>K-8 Registration</title>
</head>
<body>

    <div id="reg" class="tab-pane fade">
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

            <button type="submit" name="submit" class="btn btn-primary">Enter Another Child</button><br><br>

            <button type="submit" name="submit" class="btn btn-primary">Apply</button>
        </form>
    </div>
</body>
</html>
