package com.mohan;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class SessionInfoServlet
 */
public class SessionInfoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        long creationTime = session.getCreationTime();
        long lastAccessedTime = session.getLastAccessedTime();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String creationTimeFormatted = dateFormat.format(creationTime);
        String lastAccessedTimeFormatted = dateFormat.format(lastAccessedTime);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");

        out.println("<p>Session Creation Time: " + creationTimeFormatted + "</p>");
        out.println("<p>Last Access Time: " + lastAccessedTimeFormatted + "</p>");
        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}