<%--
  Created by IntelliJ IDEA.
  User: NADHIRAH
  Date: 13/11/2021
  Time: 11:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>My Previous Studies</title>

</head>
<body>
<%@ include file="Menu.html"%>

<form name = "StudiesForm" method="post" action="MyPrevStudies.jsp">
    <br/>
    <br/>
    <label><input type="text" name="myCGPA" placeholder="CGPA..."><br><br></label>
    <label><input type="text" name="myPrevProgram" placeholder="Previous Program..."><br><br></label>
    <label><input type="text" name="myPrevCampus" placeholder="Previous Campus..."><br><br></label>
    <label><input type="text" name="myFavCourse" placeholder="Favourite Course..."><br><br></label>
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

<%
    String mytext = request.getParameter("myCGPA");

    if (mytext == null)
    {

    }

    else
    {
        session.setAttribute("MyCGPA", request.getParameter("myCGPA"));
        session.setAttribute("MyPrevProg", request.getParameter("myPrevProgram"));
        session.setAttribute("MyPrevCampus", request.getParameter("myPrevCampus"));
        session.setAttribute("MyFavCourse", request.getParameter("myFavCourse"));


        out.println("<h6>" + getMessage() + "</h6>");    }
%>

<%--<h1><%= "MY PREVIOUS STUDY PAGE" %>
    <jsp:include page="MyPrevStudiesServlet"/></h1>
--%>

</body>
</html>
