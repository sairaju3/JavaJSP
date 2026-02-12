package com.mohan;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Time
 */
public class Time extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Time() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LocalDate myObj = LocalDate.now(); 
        LocalTime myObj1 = LocalTime.now();
        
        response.setIntHeader("Refresh", 1);
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<style>");
        out.println("body { background-color: yellow; color: black; font-family: Arial, sans-serif; }");
        out.println("h1 { font-size: 24px; }");
        out.println("h2 { font-size: 20px; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>" + myObj + "</h1>");
        out.println("<h2>" + myObj1 + "</h2>");
        out.println("</body>");
        out.println("</html>");
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
