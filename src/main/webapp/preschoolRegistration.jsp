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
        <div class="container">

            <h2>Pre-School Registration</h2>

            <div class="panel-group" id="accordion">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h4 class="panel-title">
                            <a data-toggle="collapse" data-parent="#accordion" href="#collapse1">Half-Day 3K</a>
                        </h4>
                    </div>

                    <div id="collapse1" class="panel-collapse collapse in">
                        <div class="panel-body">

                            <form action="/pre3k" method="get">
                                <h3><strong>7:30am - 11:00am</strong></h3>

                                <input type="checkbox" id="MT3k" name="MT3k" value="Monday and Tuesday $120 per month">Monday and Tuesday $120 per month<br>
                                <input type="checkbox" id="MTF3k" name="MTF3k" value="Monday, Thursday, and Friday $180 per month">Monday, Thursday, and Friday $180 per month<br>
                                <input type="checkbox" id="childcare3kHalf" name="childcare3kHalf" value="Childcare on regular sessions days (11:00am - 3:00pm) $15 per day">Childcare on regular sessions days (11:00am - 3:00pm) $15 per day<br>
                                <button type="submit" name="submit" class="btn btn-primary btn-lg">Apply</button>
                            </form>
                        </div>
                    </div>
                </div>

                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h4 class="panel-title">
                            <a data-toggle="collapse" data-parent="#accordion" href="#collapse2">Half-Day 4K</a>
                        </h4>
                    </div>
                    <div id="collapse2" class="panel-collapse collapse">
                        <div class="panel-body">

                            <form action="/pre4k" method="get">
                                <h3><strong>7:30am - 11:00am</strong></h3>

                                <input type="checkbox" id="childcare4khalf" name="childcare4khalf" value="Childcare on regular session days (11:00am-3:00pm) $15 per day">Childcare on regular session days (11:00am-3:00pm) $15 per day<br><br>

                                <p>Before care included in prices for half-day programs (6:30am - 7:30am)</p><br>
                                <button type="submit" name="submit" class="btn btn-primary btn-lg">Apply</button>
                            </form>

                        </div>
                    </div>
                </div>

                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h4 class="panel-title">
                            <a data-toggle="collapse" data-parent="#accordion" href="#collapse3">Full-Day 4K&3K</a>
                        </h4>
                    </div>
                    <div id="collapse3" class="panel-collapse collapse">
                        <div class="panel-body">

                            <form action="/full" method="get">
                                <h3><strong>Mixed Ages</strong></h3>
                                <h3><strong>7:30am - 3:00pm</strong></h3>

                                <p>$125 per week - before and after school care included in weekly price (6:30am - 7:30am) - (3:00pm - 6:00pm)</p><br>

                                <input type="checkbox" id="MWFull" name="MWFull" value="Monday - Wednesday">Monday - Wednesday<br>
                                <input type="checkbox" id="MTFull" name="MTFull" value="Monday - Thursday">Monday - Thursday<br>
                                <input type="checkbox" id="MFFull" name="MFFull" value="Monday - Friday">Monday - Friday<br>

                                <button type="submit" name="submit" class="btn btn-primary btn-lg">Apply</button>

                            </form>

                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
