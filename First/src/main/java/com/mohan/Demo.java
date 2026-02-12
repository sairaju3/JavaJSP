package com.mohan;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Demo extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        String serverName = request.getServerName();
        int serverPort = request.getServerPort();
        String scheme = request.getScheme();
        String protocol = request.getProtocol();

        response.getWriter().append("<html><body style=\"background-color:megenta;\">")
            .append("<h1 >Server Info</h1>")
            .append("<table border='1' cellpadding='10' cellspacing='0'>")
            .append("<thead>")
            .append("<tr><th>Attribute</th><th>Value</th></tr>")
            .append("</thead>")
            .append("<tbody>")
            .append("<tr><td>Server Name</td><td>").append(serverName).append("</td></tr>")
            .append("<tr><td>Server Port</td><td>").append(String.valueOf(serverPort)).append("</td></tr>")
            .append("<tr><td>Scheme</td><td>").append(scheme).append("</td></tr>")
            .append("<tr><td>Protocol</td><td>").append(protocol).append("</td></tr>")
            .append("</tbody>")
            .append("</table>")
            .append("</body></html>");
    }
}
