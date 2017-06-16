<%@ page import="org.itstep.mywebapp.model.Pet" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<html>
<head>
    <title>User List</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<table>
    <tr>
        <th>ID</th>
        <th>NAME</th>
        <th>REGISTERED</th>
    </tr>
    <c:forEach items="${petList}" var="pet">
        <jsp:useBean id="pet" type="org.itstep.mywebapp.model.Pet"/>
        <tr>
            <td><%=pet.getId()%></td>
            <td><%=pet.getName()%></td>
            <td><%=pet.getDataOfBorn()%></td>
            <td><%=pet.getAge()%></td>
            <td><%=pet.isGraft()%></td>
            <td><%=pet.getWeight()%></td>

            <td><a href="pets?action=delete&id=${pet.id}">DELETE</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>