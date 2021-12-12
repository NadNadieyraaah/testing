package com.example.jeetest;

import javax.print.attribute.standard.PrinterInfo;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MyFamilyServlet", value = "/MyFamilyServlet")
public class MyFamilyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
//keluarkan info from myself

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession();

        String myName =  (String) session.getAttribute("MyName");
        String myAge =  (String) session.getAttribute("MyAge");
        String myHobbies =  (String) session.getAttribute("MyHobbies");
        String myHometown =  (String) session.getAttribute("MyHometown");
        String myDad = (String) session.getAttribute("MyDad");
        String myMom = (String) session.getAttribute("MyMom");
        String mySibling = (String) session.getAttribute("MySibling");

        int age = Integer.parseInt(myAge);

//        MyFamily myFamily = new MyFamily("NUR NADIRAH BINTI ARIPIN", 21, "LISTEN TO MUSIC,HIKING,SLEEP",
//                "SELAMA, PERAK", "ARIPIN BIN AHMAD", "RAHMAH BINTI MOHD LAZIM", "AZIZI, AHMAD FIRDAUS," +
//                "AZANIAH, AHMAD FARHAN");

        MyFamily myFamily = new MyFamily(myName,age,myHobbies,myHometown,myDad,myMom,mySibling);

        out.println("<html><body>");

        out.println("<link rel= 'stylesheet' href='style.css'>");
        out.println("</head>");
        out.println("<body>");
 //       out.println("<table>");

        out.println("<h1>" + "NAME :" + myFamily.getMyName()+ "</h1>");
        out.println("<h1>" + "AGE :" + myFamily.getMyAge()+ "</h1>");
        out.println("<h1>" + "HOBBIES :" + myFamily.getMyHobbies()+ "</h1>");
        out.println("<h1>" + "HOMETOWN :" + myFamily.getMyHometown()+ "</h1>");
        out.println("<h1>" + "MY DAD :" + myFamily.getMyDad()+ "</h1>");
        out.println("<h1>" + "MY MOM :" + myFamily.getMyMom()+ "</h1>");
        out.println("<h1>" + "MY SIBLING :" + myFamily.getMySiblings()+ "</h1>");

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
