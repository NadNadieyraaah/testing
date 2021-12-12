package com.example.jeetest;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");


        HttpSession session = request.getSession();

        String myName =  (String) session.getAttribute("MyName");

        for (int i = 0; i < 10; i++)
        {
            out.println("<h1> MY NAME IS " + myName+ "</h1>");
            out.println("</body></html>");

        }
    }

    public void destroy() {
    }
}