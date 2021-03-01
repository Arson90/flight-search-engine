<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--
  Created by IntelliJ IDEA.
  User: Arkadiusz
  Date: 1/11/2021
  Time: 5:40 PM
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>Flight Search Engine</title>
    <style>
        body {
            text-align: center;
            background-color: aquamarine;
            font-size: 1.75rem;
        }

        table, td{
            border: solid black 2px;
        }

    </style>
</head>
<body>
    <c:out value="Flight list"></c:out>
    <table align="center">
        <tr>
            <td>ID</td>
            <td>FROM</td>
            <td>TO</td>
            <td>PRICE</td>
        </tr>
        <c:forEach items="${requestScope.flight}" var="flight">
            <tr>
                <td>${flight.id}</td>
                <td>${flight.departure}</td>
                <td>${flight.arrival}</td>
                <td>${flight.price}</td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
