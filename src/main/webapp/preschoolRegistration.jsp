<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 12/3/18
  Time: 10:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pre-School Registration</title>
</head>
<body>
<div id="pre" class="tab-pane fade">
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
</body>
</html>
