<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 12/3/18
  Time: 10:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New Member Entry Form</title>
</head>
<body>
<div id="newMember" class="tab-pane fade">
    <h1>New Member Entry Form</h1><br><br>

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

        <button type="submit" name="submit" class="btn btn-primary">Enter Another Child</button><br><br>

        <button type="submit" name="submit" class="btn btn-primary">GO</button><br><br>

        <p id="registrationFee">Non-refundable Registration Fee $70.00. Return registration fee with this form to secure your
            place. You will recieve an email confirming your child's enrollment</p>
    </form>
</div>
</body>
</html>
