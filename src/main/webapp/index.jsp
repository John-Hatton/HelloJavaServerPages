<%--
  Created by IntelliJ IDEA.
  User: John
  Date: 3/19/2024
  Time: 8:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>Title</title>--%>
<%--</head>--%>
<%--<body>--%>

<%--</body>--%>
<%--</html>--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Enter Your Name</title>
</head>
<body>
<h1>Enter Your Name:</h1>
<form action="greet" method="GET">
    <input type="text" name="name" required>
    <input type="submit" value="Greet">
</form>
</body>
</html>