package com.xworkz.conloc.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 2 , urlPatterns = "/loc")
public class Location extends HttpServlet {
	
	public Location() {
		System.out.println("creating Location");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("calling dopost from the location");
		
	String name = req.getParameter("name");
	String email = req.getParameter("userEmail");
	String startingPoint = req.getParameter("startingPoint");
	String destinationPoint = req.getParameter("destinationPoint");
	String gender =req.getParameter("gender");
	System.out.println(name);
	System.out.println(email);
	System.out.println(startingPoint);
	System.out.println(destinationPoint);
	System.out.println(gender);
	PrintWriter printWriter=resp.getWriter();
	


	printWriter.print("<html>");
	printWriter.print("<body>");
	printWriter.print("<h1>");
	printWriter.print("<span style = 'color:orange'>");
	if(name.length()>3 && email.length()>3 && destinationPoint.length() >3 ) {
		printWriter.print("location details given are correct");
		printWriter.print("     ");
		printWriter.print("<a href =\"index.html\">Home page</a>");
	}else {
		printWriter.print("location details given are not  correct");
		printWriter.print("     ");
		printWriter.print("<a href=\"location.html\" >send again</a>");
	}
	printWriter.print("</span>");
	printWriter.print("</h1>");
	printWriter.print("</body>");
	printWriter.print("</html>");
	}

}
