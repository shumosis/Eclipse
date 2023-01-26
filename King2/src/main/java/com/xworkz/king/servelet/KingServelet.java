package com.xworkz.king.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 12, urlPatterns = "/nirvana")
public class KingServelet extends HttpServlet {
	
	public KingServelet() {
		System.out.println("running kingservelet");
	}
	 @Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("running doget method from the kingservelet");
			
			String name = req.getParameter("name");
			String region = req.getParameter("region");
			String noOfQueens = req.getParameter("noOfQueens");
			String DOB = req.getParameter("DOB");
			String DOD = req.getParameter("DOD");
			
			System.out.println(name);
			System.out.println(region);
			System.out.println(noOfQueens);
			System.out.println(DOB );
			System.out.println(DOD );
			
			PrintWriter writer=resp.getWriter();
			writer.print	("<html>");
			writer.print	("<body>");
			writer.print	("<h1>");
			writer.print	("<span style= 'color:green;'>");
			writer.print    ("king name  " +name+" is sent succesfully");
			writer.print ("</span>");
			writer.print ("</h1>");
			writer.print	("</body>");
			writer.print	("</html>");
			resp.setContentType("text/html");	
		}
		
	
}
