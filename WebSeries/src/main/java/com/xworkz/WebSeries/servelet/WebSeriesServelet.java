package com.xworkz.WebSeries.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 11, urlPatterns = "/osho")
public class WebSeriesServelet extends HttpServlet {
	
	public WebSeriesServelet() {
		System.out.println("creating webSeriesServelet");
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
	 System.out.println("running initialze configuration");
	}
	 @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doget method from the webserviceservelet");
		
		String name = req.getParameter("name");
		String lang = req.getParameter("lang");
		String budget = req.getParameter("budget");
		String ott = req.getParameter("ott");
		String episodes = req.getParameter("episodes");
		
		System.out.println(name);
		System.out.println(lang);
		System.out.println(budget);
		System.out.println(ott);
		System.out.println(episodes);
		
		PrintWriter writer=resp.getWriter();
		writer.print	("<html>");
		writer.print	("<body>");
		writer.print	("<h1>");
		writer.print	("<span style= 'color:green;'>");
		writer.print    ("web series  " +name+" is esnt succesfully");
		writer.print ("</span>");
		writer.print ("</h1>");
		writer.print	("</body>");
		writer.print	("</html>");
		resp.setContentType("text/html");	
	}
	

}
