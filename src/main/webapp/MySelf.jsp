<%--
  Created by IntelliJ IDEA.
  User: NADHIRAH
  Date: 7/11/2021
  Time: 7:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language= "java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>MY SELF PAGE</title>

</head>
<body>


<%@ include file="Menu.html"%>

<%--form untuk input from user--%>

        <form name = "MySelfForm" method="post" action="MySelf.jsp">
            <br/>
            <br/>
            <label><input type="text" name="myName" placeholder="Your Name..."><br><br></label>

            <label><input type="text" name="myAge" placeholder="Your Age..."><br><br></label>

            <label><input type="text" name="myHobbies" placeholder="Your Hobbies..."><br><br></label>

            <label><input type="text" name="myHometown" placeholder="Your Hometown..."><br><br></label>

            <input type="submit" value="Submit">

        </form>



<%!
    String getMessage()
    {
        return "SESSION CREATED IS DECLARATION";
    }
%>
<%--SCRIPTLET UNTUK CODING
    register session (setattribute)
    SCRIPLET DESCRIPTION, SCRIPLET EXPRESSION
    session for : change hard coded (something yang x boleh tukar)(nk get input dari user pastu boleh tukar2 input yg user masukkan)
--%>

<%
    String mytext = request.getParameter("myName");

    if (mytext == null)
    {

    }

    else
    {
        session.setAttribute("MyName", request.getParameter("myName"));
        session.setAttribute("MyAge", request.getParameter("myAge"));
        session.setAttribute("MyHobbies", request.getParameter("myHobbies"));
        session.setAttribute("MyHometown", request.getParameter("myHometown"));

        out.println("<h6>" + getMessage() + "</h6>");


    }
%>

<c:forEach var = "i" begin="1" end="5">
    <c:out value="berjaya install"/>
</c:forEach>


<%--<h1><%= "MY SELF PAGE" %>
    <jsp:include page="MySelfServlet"/></h1>
    --%>

</body>
</html>
