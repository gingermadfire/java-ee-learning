package com.gingermadfire.javaeelearning.servlets;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "DeleteCookiesServlet", value = "/delete-cookies")
public class DeleteCookiesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        Cookie cookie = new Cookie("some_id", "");

        cookie.setMaxAge(0);

        response.addCookie(cookie);
    }

}
