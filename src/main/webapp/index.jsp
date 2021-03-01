<%--
  Created by IntelliJ IDEA.
  User: Arkadiusz
  Date: 2/7/2021
  Time: 2:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>FLight Search Engine</title>
</head>
<body>
    <div>
        <h1>Flight list</h1>

        <form action="/listFlights" method="get">
            <table>
                <tr>
                    <td>ID</td>
                    <td>From</td>
                    <td>To</td>
                    <td>Cost</td>
                </tr>
                <tr>
                    <td><input type="text" name="id"></td>
                    <td><input type="text" name="departure"></td>
                    <td><input type="text" name="arrive"></td>
                    <td><input type="text" name="cost"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Search"></td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
