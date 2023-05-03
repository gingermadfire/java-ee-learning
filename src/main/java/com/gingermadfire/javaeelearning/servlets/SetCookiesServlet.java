package com.gingermadfire.javaeelearning.servlets;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "SetCookiesServlet",value = "/set-cookies")
public class SetCookiesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        Cookie cookie1 = new Cookie("some_id", "123");
        Cookie cookie2 = new Cookie("some_name", "Tom");

        cookie1.setMaxAge(60 * 60);
        cookie2.setMaxAge(60 * 60);

        response.addCookie(cookie1);
        response.addCookie(cookie2);
    }

}
