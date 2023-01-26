package com.xworkz.friends.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 78,urlPatterns = "/shu")
public class Friend  extends HttpServlet{
	
	public Friend() {
	System.out.println("runn9ing freiend");
	}
	
	 @Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("running doget method from the friendsservelet");
			
			String name = req.getParameter("name");
			String fatherName = req.getParameter("fatherName");
			String grandFatherName = req.getParameter("grandFatherName");
			String motherName = req.getParameter("motherName");
			String grandMotherName = req.getParameter("grandMotherName");
			String daughterName = req.getParameter("daughterName");
			String sonName = req.getParameter("sonName");
			String homeName = req.getParameter("homeName");
			String villageName = req.getParameter("villageName");
			String districtNmae = req.getParameter("districtNmae");
			String education = req.getParameter("education");
			String work = req.getParameter("work");
			String DOB = req.getParameter("DOB");
			String salary = req.getParameter("salary");
			String weight = req.getParameter("weight");
			String height = req.getParameter("height");
			String color = req.getParameter("color");
			String favFood = req.getParameter("favFood");
			String favPlace = req.getParameter("favPlace");
			String favFriend = req.getParameter("favFriend");
			
			System.out.println(name);
			System.out.println(fatherName);
			System.out.println(grandFatherName );
			System.out.println(motherName );
			System.out.println(grandMotherName );
			System.out.println(daughterName );
			System.out.println(sonName );
			System.out.println(homeName );
			System.out.println(villageName );
			System.out.println(districtNmae );
			System.out.println(education );
			System.out.println(work );
			System.out.println(DOB );
			System.out.println(salary );
			System.out.println(weight );
			System.out.println(height );
			System.out.println(color );
			System.out.println(favFood );
			System.out.println(favPlace );
			System.out.println(favFriend );
			
			
			PrintWriter writer=resp.getWriter();
			writer.print	("<html>");
			writer.print	("<body>");
			writer.print	("<h1>");
			writer.print	("<span style= 'color:green;'>");
			writer.print    ("king name  " +name+" is sent succesfully");
			writer.print ("</span>");
			writer.print ("</h1>");
			writer.print	("</body>");
			writer.print	("</html>");
			resp.setContentType("text/html");	
		}
		

}
