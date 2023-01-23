package com.xworkz.Maza.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 2, urlPatterns = "/gandu")
public class BinduJeera  extends HttpServlet {
	
	public  BinduJeera() {
		System.out.println("running BIndujeera");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("creted doget");
	}

}
