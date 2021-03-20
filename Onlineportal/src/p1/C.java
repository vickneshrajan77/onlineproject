package p1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class C extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
       HttpSession session = request.getSession();
       String phoneno=(String) session.getAttribute("phoneno");
       String a2=(String) session.getAttribute("a2");
       String b2=(String) session.getAttribute("b2");
       String e2=(String) session.getAttribute("e2");
       
    Model m= new Model();
    m.setPhoneno(phoneno);
    m.setA2(a2);
    m.setB2(b2);
    m.setE2(e2);
    boolean status=m.c();
    if(status==true)
    {
    	response.sendRedirect("/Onlineportal/bbn.jsp");
    }
    else
    {
    	response.sendRedirect("/Onlineportal/mobiles.html");
    }
	}
}
