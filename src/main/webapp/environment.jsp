<jsp:useBean id="variables" scope="request" type="java.util.Map"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${variables}" var="entry">
    Key = ${entry.key}, value = ${entry.value}<br>
</c:forEach>
</body>
</html>
