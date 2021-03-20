package p1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class BB extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
       HttpSession session = request.getSession();
       String phoneno=(String) session.getAttribute("phoneno");
       String a1=(String) session.getAttribute("a1");
       String b1=(String) session.getAttribute("b1");
       String e1=(String) session.getAttribute("e1");
       
    Model m= new Model();
    m.setPhoneno(phoneno);
    m.setA1(a1);
    m.setB1(b1);
    m.setE1(e1);
    boolean status=m.bb();
    if(status==true)
    {
    	response.sendRedirect("/Onlineportal/wishlist.jsp");
    }
    else
    {
    	response.sendRedirect("/Onlineportal/mobiles.html");
    }
	}
}
