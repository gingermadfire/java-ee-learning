package com.gingermadfire.javaeelearning.servlets;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(name = "LibraryServlet", value = "/library")
public class LibraryServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/javaee",
                    "postgres",
                    "postgres"
            );

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM books");

            while (rs.next()) {
                out.println(rs.getString("title"));
            }

            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
