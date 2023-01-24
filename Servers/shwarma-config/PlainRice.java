package com.xworkz.GhodaServ;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(loadOnStartup = 1,value = "GET")
public class PlainRice extends HttpServlet{
	
	public PlainRice() {
		System.out.println(this.getClass().getSimpleName());
	}

}
