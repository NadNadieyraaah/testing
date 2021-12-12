package com.example.jeetest;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MySelfServlet", value = "/MySelfServlet")
public class MySelfServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        //keluarkan info from myself

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        //declare dulu session
        HttpSession session = request.getSession();



        String myName =  (String) session.getAttribute("MyName");
        String myAge =  (String) session.getAttribute("MyAge");
        String myHobbies =  (String) session.getAttribute("MyHobbies");
        String myHometown =  (String) session.getAttribute("MyHometown");

        int age = Integer.parseInt(myAge);


//       MySelf mySelf1 = new MySelf("NUR NADIRAH BINTI ARIPIN", 21, "LISTEN TO MUSIC,HIKING,SLEEP", "SELAMA, PERAK");
//        out.println("<html><body>");

        MySelf mySelf1 = new MySelf(myName, age, myHobbies,myHometown);


        out.println("<html>");
        out.println("<head>");
        out.println("<link rel= 'stylesheet' href='style.css'>");
        out.println("</head>");
        out.println("<body>");
//        out.println("<table>");

        out.println("<h1>" + "NAME :" + mySelf1.getMyName()+ "</h1>");
        out.println("<h1>" + "AGE :" + mySelf1.getMyAge()+ "</h1>");
        out.println("<h1>" + "HOBBIES :" + mySelf1.getMyHobbies()+ "</h1>");
        out.println("<h1>" + "HOMETOWN :" + mySelf1.getMyHometown()+ "</h1>");

        out.println("<h1>" + "VEHICLE BRAND : " + MyVehicle.MyVehicleBrand + "</h1>");
        out.println("<h1>" + "VEHICLE TYPE : "+ MyVehicle.MyVehicleType + "</h1>");
        out.println("<h1>" + "VEHICLE ID : " + MyVehicle.MyVehicleID + "</h1>");


//        out.println("</head>");
//        out.println("</body>");
        out.println("</body></html>");


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
