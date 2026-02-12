package com.mohan;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class VisitCountServlet
 */

public class VisitCountServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(true);

        Integer visitCount = (Integer) session.getAttribute("visitCount");
        if (visitCount == null) {
            visitCount = 0;
        }

        visitCount++;
        session.setAttribute("visitCount", visitCount);

        // Set response content type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Display the visit count
        out.println("<html><body>");
        out.println("<h2>Visit Count</h2>");
        out.println("<p>You have visited this page " + visitCount + " times.</p>");
        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}

