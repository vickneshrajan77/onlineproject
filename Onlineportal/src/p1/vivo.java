package p1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class vivo extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	private String a2;
	private String b2;
	private String c2;
	private String d2;
	private String e2;
	private String f2;
	private String g2;
	private String h2;
	private String i2;
	private String j2;
	private String k2;
	private String a3;
	private String b3;
	private String c3;
	private String d3;
	private String e3;
	private String f3;
	private String g3;
	private String h3;
	private String i3;
	private String j3;
	private String k3;
       
      
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
    	
    	 Model m=new Model();
    	 m.vivo();
    	 m.vivo1();
    	 boolean status= m.vivo();
    	boolean status1 = m.vivo1();
  	   HttpSession session = request.getSession(true);
  	   System.out.println(status);
  	   System.out.println(status1);
  	  if((status1&&status)==true)
  	  {
  		  a2=m.getA2();
  		  b2=m.getB2();
  				  c2=m.getC2();
  				  d2=m.getD2();
  				  e2=m.getE2();
  				  f2=m.getF2();
  				  g2=m.getG2();
  				  h2=m.getH2();
  				  i2=m.getI2();
  				  j2=m.getJ2();
  				  k2=m.getK2();
  				  
  				 a3= m.getA3();
  				 b3= m.getB3();
  				 c3= m.getC3();
  				 d3= m.getD3();
  				  e3=m.getE3();
  				  f3=m.getF3();
  				  g3=m.getG3();
  				  h3=m.getH3();
  				  i3=m.getI3();
  				  j3=m.getJ3();
  				  k3=m.getK3();
  				  
  		 session.setAttribute("a2", a2);
  		session.setAttribute("b2", b2);
  		session.setAttribute("c2", c2);
  		session.setAttribute("d2", d2);
  		session.setAttribute("e2", e2);
  		session.setAttribute("f2", f2);
  		session.setAttribute("g2", g2);
  		session.setAttribute("h2", h2);
  		session.setAttribute("i2", i2);
  		session.setAttribute("j2", j2);
  		session.setAttribute("k2", k2);
  		session.setAttribute("a3", a3);
  		session.setAttribute("b3", b3);
  		session.setAttribute("c3", c3);
  		session.setAttribute("d3", d3);
  		session.setAttribute("e3", e3);
  		session.setAttribute("f3", f3);
  		session.setAttribute("g3", g3);
  		session.setAttribute("h3", h3);
  		session.setAttribute("i3", i3);
  		session.setAttribute("j3", j3);
  		session.setAttribute("k3", k3);
  		 
  		 response.sendRedirect("/Onlineportal/vivomobile.jsp");
  	  }
  	  else
  	  {
  		  response.sendRedirect("/Onlineportal/mobiles.html"); 
  		  
  	  }
    }
	 
    

}
