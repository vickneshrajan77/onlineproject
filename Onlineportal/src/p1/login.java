package p1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String phoneno;
	 
       
   @Override
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
   {
	    String email = request.getParameter("email");
	   String password =request.getParameter("password");
	   
	   Model m=new Model();
	  m.setEmail(email);
	  m.setPassword(password);
	  boolean status= m.login();
	  phoneno=m.getPhoneno();
	   HttpSession session = request.getSession(true);
	  if(status==true)
	  {
		 session.setAttribute("phoneno", phoneno);
		 response.sendRedirect("/Onlineportal/home.html");
	  }
	  else
	  {
		  response.sendRedirect("/Onlineportal/loginfail.html"); 
		  
	  }
	   
	
}
}
