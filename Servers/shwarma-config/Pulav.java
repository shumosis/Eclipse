package com.xworkz.GhodaServ;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 3,value = "DELETE")
public class Pulav extends HttpServlet {
	
	public Pulav() {
		System.out.println(this.getClass().getSimpleName());
	}
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
System.out.println("calling doDelete From Pulav");
		
		String data = "why u not talking with me , what happened ";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");	
	}

}
