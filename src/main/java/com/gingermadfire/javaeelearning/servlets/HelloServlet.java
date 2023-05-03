package com.gingermadfire.javaeelearning.servlets;

import com.gingermadfire.javaeelearning.test.Cart;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();

        Cart cart = (Cart) session.getAttribute("cart");

        String cartName = request.getParameter("cart-name");
        int cartQuantity =Integer.parseInt(request.getParameter("cart-quantity"));

        if (cart == null) {
            cart = new Cart();

            cart.setName(cartName);
            cart.setQuantity(cartQuantity);
        }

        session.setAttribute("cart", cart);

        response.setContentType("text/html");
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Hello, " + name+ " " + surname + "</h1>");
        out.println("</body></html>");

        getServletContext().getRequestDispatcher("/show-cart.jsp").forward(request, response);
    }

}