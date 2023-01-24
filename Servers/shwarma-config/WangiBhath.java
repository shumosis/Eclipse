package com.xworkz.GhodaServ;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,value = "Osho")
public class WangiBhath  extends HttpServlet{
	//put ,patch ,option trace
	public WangiBhath() {
		System.out.println(this.getClass().getSimpleName());
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("calling doget from wangibhath");
		
		String data = "hi my name  is shubham arvind Garve ,how r u ? ,why u not talking with me ? , u want to tell me something ? ";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
	}
	@Override
	protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("calling dohead");
		
		String data = "why u not talking with me , what happened ";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("calling doPost ");
		
		String data = "hello friend what r doing ";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");	
	}
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println("calling doDelete ");
		
		String data = "why u not talking with me , what happened ";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");	
	}
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 System.out.println("calling doPut");
			
			String data = "is I done something wrong";
			PrintWriter writer=resp.getWriter();
			writer.print(data);
			resp.setContentType("text/plain");	
	}
	
	@Override
	protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 System.out.println("calling doTrace");
			
			String data = "hey tell me , u have to talk ";
			PrintWriter writer=resp.getWriter();
			writer.print(data);
			resp.setContentType("text/plain");	
	}
	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 System.out.println("calling doOption");
			
			String data = "see if u dont want to talk tell me ,okary by ,i will not msg u again ";
			PrintWriter writer=resp.getWriter();
			writer.print(data);
			resp.setContentType("text/plain");	
	
	}

	
	

}
