package com.xworkz.fav.servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/dhoka")
public class HatedPerson extends HttpServlet{
	
	public HatedPerson() {
		System.out.println("creating "+this.getClass().getSimpleName());
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String fname=req.getParameter("firstName");
		String lname=req.getParameter("lastName");
		String gender=req.getParameter("gender");
		String reason=req.getParameter("reason");
		String address=req.getParameter("address");
		//String image = req.getParameter("resume");
		
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(gender);
		System.out.println(reason);
		System.out.println(address);
		
	RequestDispatcher out=req.getRequestDispatcher("Display.jsp");
		
		req.setAttribute("firstName",fname);
		req.setAttribute("lastName",lname);
		req.setAttribute("reason",reason);
		req.setAttribute("address",address);
		req.setAttribute("gender",gender);
		//req.setAttribute("resume",image);
		out.forward(req, resp);
		
	}

}
