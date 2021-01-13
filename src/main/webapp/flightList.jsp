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
    <title>All flight in the list</title>
</head>
<body>
    <c:out value="Flight list from DB"></c:out>
    <table>
        <tr>
            <td>FROM</td>
            <td>TO</td>
        </tr>
        <c:forEach items="${requestScope.list}" var="list">
            <tr>
                <td>${list.departure}</td>
                <td>${list.arrival}</td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
