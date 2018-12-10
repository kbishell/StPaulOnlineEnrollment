<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 11/5/18
  Time: 3:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<%@include file="head.jsp"%>
<%--<head>
    <title>K-8 Registration</title>
</head>--%>
<body>
        <div id="reg" class="tab-pane fade">
            <div class="container center_div">

                <form action="/reg" method="get">

                    <h2>Register K-8 Students</h2>
                    <div class="panel-group" id="accordionReg">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <h4 class="panel-title">
                                    <a data-toggle="collapse" data-parent="#accordionReg" href="#collapse4">Father's Information</a>
                                </h4>
                            </div>
                            <div id="collapse4" class="panel-collapse collapse in">
                                <div class="panel-body">
                                    <label>Father's Name: </label>
                                    <input type="text" id="regFatherName" placeholder="Father's Name" name="fatherName"><br><br>
                                    <label>Father's Address: </label>
                                    <input type="text" id="regFatherAddress" placeholder="Father's Address" name="fatherAddress"><br><br>
                                    <label>Father's Employee: </label>
                                    <input type="text" id="regFatherEmployer" placeholder="Father's Employe" name="fatherEmployer"><br><br>
                                    <label>Father's Place of Birth: </label>
                                    <input type="text" id="regFatherPlaceOfBirth" placeholder="Father's Place of Birth" name="fatherPlaceOfBirth"><br><br>
                                    <label>Father's Phone: </label>
                                    <input type="text" id="regFatherPhone" placeholder="Father Phone" name="fatherPhone"><br><br>
                                    <label>Father's Work Phone: </label>
                                    <input type="text" id="regFatherWorkPhone" placeholder="Father Work Phone" name="fatherWorkPhone"><br><br>
                                    <label>Father's Church Affiliation: </label>
                                    <input type="text" id="regFatherAffiliation" placeholder="Church Affiliation" name="fatherAffiliation"><br><br></div>
                            </div>
                        </div>
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <h4 class="panel-title">
                                    <a data-toggle="collapse" data-parent="#accordionReg" href="#collapse5">Mother's Information</a>
                                </h4>
                            </div>
                            <div id="collapse5" class="panel-collapse collapse">
                                <div class="panel-body">
                                    <label>Mother's Name: </label>
                                    <input type="text" id="regMotherName" placeholder="Mother's Name" name="motherName"><br><br>
                                    <label>Mother's Address: </label>
                                    <input type="text" id="regMotherAddress" placeholder="Mother's Address" name="motherAddress"><br><br>
                                    <label>Mother's Employee: </label>
                                    <input type="text" id="regMotherEmployer" placeholder="Mother's Employe" name="motherEmployer"><br><br>
                                    <label>Mother's Place of Birth: </label>
                                    <input type="text" id="regMotherPlaceOfBirth" placeholder="Mother's Place of Birth" name="motherPlaceOfBirth"><br><br>
                                    <label>Mother's Phone: </label>
                                    <input type="text" id="regMotherPhone" placeholder="Mother Phone" name="motherPhone"><br><br>
                                    <label>Mother's Work Phone: </label>
                                    <input type="text" id="regMotherWorkPhone" placeholder="Mother Work Phone" name="motherWorkPhone"><br><br>
                                    <label>Mother's Church Affiliation: </label>
                                    <input type="text" id="regMotherAffiliation" placeholder="Church Affiliation" name="affiliation"><br><br></div>
                            </div>
                        </div>
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <h4 class="panel-title">
                                    <a data-toggle="collapse" data-parent="#accordionReg" href="#collapse6">Child(ren)'s Information</a>
                                </h4>
                            </div>
                            <div id="collapse6" class="panel-collapse collapse">
                                <div class="panel-body">
                                    <label>Child's Name: </label>
                                    <input type="text" id="regChildName" placeholder="Child's Name" name="childName"><br><br>
                                    <label>Child's Phone: </label>
                                    <input type="text" id="regPhone" placeholder="Phone Number" name="phone"><br><br>
                                    <label>Grade: drop down 3k-8 </label>
                                    <input type="text" id="regGrade" placeholder="Grade" name="grade"><br><br>
                                    <label>Age in Years: </label>
                                    <input type="text" id=regYears" placeholder="Age: Years" name="years"><br><br>
                                    <label>Age in Months: </label>
                                    <input type="text" id="regMonths" placeholder="Age: months" name="months"><br><br>
                                    <label>Address: </label>
                                    <input type="text" id="regAddress" placeholder="Address" name="address"><br><br>
                                    <label>City: </label>
                                    <input type="text" id="regCity" placeholder="City" name="city"><br><br>
                                    <label>State: </label>
                                    <input type="text" id="regState" placeholder="State" name="state"><br><br>
                                    <label>zip: </label>
                                    <input type="text" id="regZip" placeholder="zip" name="zip"><br><br>
                                    <label>Email: </label>
                                    <input type="text" id="regEmail" placeholder="email" name="email"><br><br>
                                    <label>Pastor: </label>
                                    <input type="text" id="regPastor" placeholder="Pastor" name="pastor"><br><br>
                                    <label>Church: </label>
                                    <input type="text" id="regChurch" placeholder="Church" name="church"><br><br>
                                    <label>Date of Enrollment: </label>
                                    <input type="text" id="regDob" placeholder="Date of Enrollment" name="deo"><br><br><br>

                                    <label>Baptized: </label> <input type="radio" id="regChildBaptized" name="childBaptized" value="yes"> Yes
                                    <input type="radio" id="regChildNotBaptized" name="childNotBaptized" value="no"> No<br><br>
                                    <input type="text" id="regDateOfBaptism" placeholder="Date Of Baptism" name="dateOfBaptism"><br><br><br>

                                    <label>Other Children in Your Family: </label>
                                    <input type="text" id="regFirstName" placeholder="First Name" name="firstName">
                                    <input type="text" id="regLastName" placeholder="Last Name" name="lastName"><br><br><br>
                                    <label>Enter Any Comments or Concerns: </label><br>
                                    <textarea rows="4" cols="50">Comments...</textarea><br><br><br></div>

                            </div>
                        </div>
                    </div>

                                <button type="submit" name="submit" class="btn btn-primary btn-lg">Enter Another Child</button><br><br>

                                <button type="submit" name="submit" class="btn btn-primary btn-lg">Apply</button>
            </form>
        </div>
    </div>
</body>
</html>
