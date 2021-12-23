<%--
  Created by IntelliJ IDEA.
  User: NADHIRAH
  Date: 7/11/2021
  Time: 8:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>My Family</title>

</head>
<body>
<%@ include file="Menu.html"%>

<form name = "FamilyForm" method="post" action="MyFamily.jsp">
    <br/>
    <br/>
    <label> <input type="text" name="myDad" placeholder="Father's Name..."><br><br></label>

    <label> <input type="text" name="myMom" placeholder="Mother's Name..."><br><br></label>

    <label><input type="text" name="mySibling" placeholder="Sibling's Name"><br><br></label>
    <br>
    <br>
    <input type="submit" value="Submit">
    <br>
</form>


<%!
    String getMessage()
    {
        return "SESSION CREATED IS DECLARATION";
    }
%>

<%
    String mytext = request.getParameter("myDad");

    if (mytext == null)
    {

    }

    else
    {
        session.setAttribute("MyDad", request.getParameter("myDad"));
        session.setAttribute("MyMom", request.getParameter("myMom"));
        session.setAttribute("MySibling", request.getParameter("mySibling"));


        out.println("<h6>" + getMessage() + "</h6>");    }
%>

<%--<h1><%= "MY FAMILY PAGE" %>
    <jsp:include page="MyFamilyServlet"/></h1>
    --%>

</body>
</html>
