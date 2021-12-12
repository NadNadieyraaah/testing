package com.example.jeetest;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MyPrevStudiesServlet", value = "/MyPrevStudiesServlet")
public class MyPrevStudiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession();

        String myName =  (String) session.getAttribute("MyName");
        String myAge =  (String) session.getAttribute("MyAge");
        String myHobbies =  (String) session.getAttribute("MyHobbies");
        String myHometown =  (String) session.getAttribute("MyHometown");
        String myCgpa = (String) session.getAttribute("MyCGPA");
        String myPrevProg = (String) session.getAttribute("MyPrevProg");
        String myPrevCampus = (String) session.getAttribute("MyPrevCampus");
        String myFavCourse = (String) session.getAttribute("MyFavCourse");

        int age = Integer.parseInt(myAge);
        double cgpa = Double.parseDouble(myCgpa);


        MyPrevStudies myPrevStudies= new MyPrevStudies(myName,age,myHobbies,myHometown,cgpa,myPrevProg,myPrevCampus,myFavCourse);

        out.println("<html><body>");

        out.println("<link rel= 'stylesheet' href='style.css'>");
        out.println("</head>");
        out.println("<body>");
        //       out.println("<table>");

        out.println("<h1>" + "NAME :" + myPrevStudies.getMyName()+ "</h1>");
        out.println("<h1>" + "AGE :" + myPrevStudies.getMyAge()+ "</h1>");
        out.println("<h1>" + "HOBBIES :" + myPrevStudies.getMyHobbies()+ "</h1>");
        out.println("<h1>" + "HOMETOWN :" + myPrevStudies.getMyHometown()+ "</h1>");
        out.println("<h1>" + "MY CGPA :" + myPrevStudies.getMyCGPA()+ "</h1>");
        out.println("<h1>" + "MY PREVIOUS PROGRAM :" + myPrevStudies.getMyPrevProgram()+ "</h1>");
        out.println("<h1>" + "MY PREVIOUS CAMPUS :" + myPrevStudies.getMyPrevCampus()+ "</h1>");
        out.println("<h1>" + "MY FAVOURITE COURSE :" + myPrevStudies.getMyFavCourse()+ "</h1>");

        out.println("<h1>" + "VEHICLE BRAND : " + MyVehicle.MyVehicleBrand + "</h1>");
        out.println("<h1>" + "VEHICLE TYPE : "+ MyVehicle.MyVehicleType + "</h1>");
        out.println("<h1>" + "VEHICLE ID : " + MyVehicle.MyVehicleID + "</h1>");
        out.println("</table>");

        out.println("</body></html>");

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
