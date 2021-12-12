<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<%@ include file="Menu.html"%>
<h1>
    <%= "\n\nHELLO,  " + session.getAttribute("MyName") %>
    <%= "GOOD MORNING"%>
</h1>

<br/>

<div class="vertical-menu">
    <a href="hello-servlet">Hello Servlet</a><br>
    <a href="MySelfServlet">My Self Servlet</a><br>
    <a href="MyStudentServlet">My Student Servlet</a><br>
    <a href="MyFamilyServlet">My Family Servlet</a><br>
    <a href="MyPrevStudiesServlet">My Previous Study Servlet</a><br>
</div>

</body>
</html>