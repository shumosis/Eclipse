package com.xworkz.GhodaServ;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,value = "GET")
public class Biryani extends HttpServlet {
	
	public Biryani() {
		System.out.println(this.getClass().getSimpleName());
	}
	
	@Override
	protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
System.out.println("calling do From Pulav");
		
		String data = "why u not talking with me , what happened ";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");	
	}

}
