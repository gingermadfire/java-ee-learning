package com.gingermadfire.javaeelearning;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Hello, " + name+ " " + surname +"</h1>");
        out.println("</body></html>");

        RequestDispatcher dispatcher = request.getRequestDispatcher("/redirect-servlet");
        dispatcher.forward(request, response);
    }
}