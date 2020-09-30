<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.Map" %>
<%@ page import="org.example.app.client.EnvironmentClient" %><%
    EnvironmentClient client = new EnvironmentClient();
    Map<String, String> vars = client.call();
%>--%>
<html>
<body>
<h2>Hello!</h2>
<p>Trying to get Environment Variables, Brah?</p>
<p><a href="variables.xhtml">JSF example</a></p>
<a href="environment.jsp">
    <button>JSP example</button>
</a>
</body>
</html>
