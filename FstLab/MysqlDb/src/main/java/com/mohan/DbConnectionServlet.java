package com.mohan;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DbConnectionServlet")
public class DbConnectionServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Database credentials
    private static final String DB_URL = "jdbc:mysql://localhost:3306";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "Mohan@14325";


    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        // Set response content type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        Connection conn = null;

        try {
            Class.forName(JDBC_DRIVER);

            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            
            out.println("<h1>Database Connection Success!</h1>");
        } catch (SQLException se) {
            out.println("<h1>Database Connection Failed: " + se.getMessage() + "</h1>");
        } catch (Exception e) {
            out.println("<h1>Database Connection Failed: " + e.getMessage() + "</h1>");
        } finally {
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                out.println("<h1>Error closing connection: " + se.getMessage() + "</h1>");
            }
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        doGet(request, response);
    }
}
