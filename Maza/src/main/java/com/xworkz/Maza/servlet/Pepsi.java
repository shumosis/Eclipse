package com.xworkz.Maza.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 5, urlPatterns = "/dadda")
public class Pepsi  extends HttpServlet {
	
	public Pepsi() {
		System.out.println("creating pepsi");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("creted doget");
	}

}
