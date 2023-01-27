package com.xworkz.conloc.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1 ,urlPatterns = "/con")
public class Contact extends HttpServlet {
	
	public Contact() {
		System.out.println("creating Contact");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("calling dopost from the contact");
		
	String name = req.getParameter("name");
	String email = req.getParameter("userEmail");
	String mobile = req.getParameter("mobile");
	String comments = req.getParameter("comments");
	
	System.out.println(name);
	System.out.println(email);
	System.out.println(mobile);
	System.out.println(comments);
	
	PrintWriter printWriter=resp.getWriter();
	
	
	long number = Long.parseLong(mobile);
	printWriter.print("<html>");
	printWriter.print("<body>");
	printWriter.print("<h1>");
	printWriter.print("<span style = 'color:orange'>");
	if(comments.length()>3 && email.length()>3 && name.length() >3  && number>7000000000L ) {
		printWriter.print("Contact details given are correct");
		printWriter.print("     ");
		printWriter.print("<a href =\"index.html\">Home page</a>");
	}else {
		printWriter.print("Contact details given are not correct");
		printWriter.print("     ");
		printWriter.print("<a href=\"Contact.html\" >send again</a>");
	}
	printWriter.print("</span>");
	printWriter.print("</h1>");
	printWriter.print("</body>");
	printWriter.print("</html>");
	}

}
