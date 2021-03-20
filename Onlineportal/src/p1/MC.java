package p1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class MC extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	private String a4;
	private String b4;
	private String c4;
	private String d4;
	private String e4;
	private String phoneno;
       
   
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session = request.getSession();
		phoneno=(String) session.getAttribute("phoneno");
		Model m= new Model();
		m.setPhoneno(phoneno);
		boolean status = m.myacc();	
		if(status==true)
		{
			 a4=m.getA4();
			 b4=m.getB4();
		 c4=m.getC4();
			 d4=m.getD4();
			 e4=m.getE4();
	
			session.setAttribute("a4", a4);
			session.setAttribute("b4", b4);
			session.setAttribute("c4", c4);
			session.setAttribute("d4", d4);
			session.setAttribute("e4", e4);
			response.sendRedirect("/Onlineportal/myaccount.jsp");
		}
		
		else
		{
			response.sendRedirect("./Onlineportal/home.html");
		}
		

	}
}
		
		
		
		
		
		
		
		
		
		
