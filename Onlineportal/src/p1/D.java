package p1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class D extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
       HttpSession session = request.getSession();
       String phoneno=(String) session.getAttribute("phoneno");
       String a3=(String) session.getAttribute("a3");
       String b3=(String) session.getAttribute("b3");
       String e3=(String) session.getAttribute("e3");
       
    Model m= new Model();
    m.setPhoneno(phoneno);
    m.setA3(a3);
    m.setB3(b3);
    m.setE3(e3);
    boolean status=m.d();
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
