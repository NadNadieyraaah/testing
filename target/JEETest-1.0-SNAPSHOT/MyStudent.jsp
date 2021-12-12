<%--
  Created by IntelliJ IDEA.
  User: NADHIRAH
  Date: 7/11/2021
  Time: 7:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MY STUDENT PAGE</title>

</head>
<body>
<%@ include file="Menu.html"%>

<form name = "StudentForm" method="post" action="MyStudent.jsp">
    <br/>
    <br/>
    <label><input type="text" name="myMatricNo" placeholder="Matric Number..."><br><br></label>
    <label><input type="text" name="myProgramCode" placeholder="Program Code..."><br><br></label>
    <label><input type="text" name="myCampus" placeholder="Campus..."><br><br></label>
    <br>
    <br>
    <input type="submit" value="Submit">
    <br/>
</form>


<%!
    String getMessage()
    {
        return "SESSION CREATED IS DECLARATION";
    }
%>

<%-- name,age tu tak letak dah sbb session dia dah created dah--%>

    <%
    String mytext = request.getParameter("myMatricNo");

    if (mytext == null)
    {

    }

    else
    {
        session.setAttribute("MyMatricNo", request.getParameter("myMatricNo"));
        session.setAttribute("MyProgramCode", request.getParameter("myProgramCode"));
        session.setAttribute("MyCampus", request.getParameter("myCampus"));


        out.println("<h6>" + getMessage() + "</h6>");
    }
%>

<%--<h1><%= "\nMY STUDENT PAGE\n\n\n\n\n" %>


   <jsp:include page="MyStudentServlet"/></h1>
   --%>

</body>
</html>
