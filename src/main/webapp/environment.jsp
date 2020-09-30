<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.Map" %>
<%@ page import="org.example.app.client.EnvironmentClient" %><%
    EnvironmentClient client = new EnvironmentClient();
    Map<String, String> vars = client.call();
    pageContext.setAttribute("vars", vars.entrySet());
%>
<html lang="en">
<head>
    <title>Title</title>
</head>
<body>
<table border = "1">
    <c:forEach var="entry" items="${vars}" >
    <tr>
        <td>${entry.key}</td>
        <td>${entry.value}</td>

    </tr>
    </c:forEach>
</body>
</html>
