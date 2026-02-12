package com.mohan;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HeaderServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        java.io.PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>HTTP Request Headers</h2>");
        
        java.util.Enumeration<String> headerNames = request.getHeaderNames();

        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            String headerValue = request.getHeader(headerName);
            
            out.println("<p><strong>" + headerName + ":</strong> " + headerValue + "</p>");
        }

        out.println("</body></html>");
        
        out.close();
    }
}
