package com.example.jeetest;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MyStudentServlet", value = "/MyStudentServlet")
public class MyStudentServlet extends HttpServlet {
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
        String matricNo = (String) session.getAttribute("MyMatricNo");
        String programCode = (String) session.getAttribute("MyProgramCode");
        String campus = (String) session.getAttribute("MyCampus");

        int age = Integer.parseInt(myAge);

//        MyStudent myStudent = new MyStudent("NUR NADIRAH BINTI ARIPIN", 21, "LISTEN TO MUSIC,HIKING,SLEEP",
//                "SELAMA,PERAK","2021196237","CS226", "UiTM MELAKA, KAMPUS JASIN");

        MyStudent myStudent = new MyStudent(myName, age ,myHobbies, myHometown, matricNo, programCode,campus);

        out.println("<html>");
        out.println("<head>");

        out.println("<link rel= 'stylesheet' href='style.css'>");
        out.println("</head>");
        out.println("<body>");
        out.println("<table>");
        out.println("<h1>" + "NAME : " + myStudent.getMyName()+ "</h1>");
        out.println("<h1>" + "AGE : " + myStudent.getMyAge()+ "</h1>");
        out.println("<h1>" + "HOBBIES : " + myStudent.getMyHobbies()+ "</h1>");
        out.println("<h1>" + "HOMETOWN : " + myStudent.getMyHometown()+ "</h1>");
        out.println("<h1>" + "MATRIC NO : " + myStudent.getMyMatricNo()+ "</h1>");
        out.println("<h1>" + "PROGRAM CODE : " + myStudent.getMyProgramCode()+ "</h1>");
        out.println("<h1>" + "CAMPUS : " + myStudent.getMyCampus()+ "</h1>");

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
