package com.xworkz.GhodaServ;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2,value = "POST")
public class Chitranna extends HttpServlet {
	
	public Chitranna() {
		System.out.println(this.getClass().getSimpleName());
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("calling doPost from Chitranna");
		
		String data = "hello friend what r doing ";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");	
	}

}
