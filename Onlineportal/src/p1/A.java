package p1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class A extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
       HttpSession session = request.getSession();
       String phoneno=(String) session.getAttribute("phoneno");
       String a=(String) session.getAttribute("a");
       String b=(String) session.getAttribute("b");
       String e=(String) session.getAttribute("e");
       
    Model m= new Model();
    m.setPhoneno(phoneno);
    m.setA(a);
    m.setB(b);
    m.setE(e);
    boolean status=m.a();
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
