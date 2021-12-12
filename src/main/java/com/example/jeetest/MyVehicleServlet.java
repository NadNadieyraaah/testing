package com.example.jeetest;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "MyVehicleServlet", value = "/MyVehicleServlet")
public class MyVehicleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        getInitParameter(MyVehicle.MyVehicleBrand);
        getInitParameter(MyVehicle.MyVehicleType);
        getInitParameter(MyVehicle.MyVehicleID);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
