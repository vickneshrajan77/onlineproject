package p1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class samsung extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	private String a;
	private String b;
	private String c;
	private String d;
	private String e;
	private String f;
	private String g;
	private String h;
	private String i;
	private String j;
	private String k;
	private String a1;
	private String b1;
	private String c1;
	private String d1;
	private String e1;
	private String f1;
	private String g1;
	private String h1;
	private String i1;
	private String j1;
	private String k1;
       
      
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
    	
    	 Model m=new Model();
    	 m.samsung();
    	 m.samsung1();
    	 boolean status= m.samsung();
    	boolean status1 = m.samsung1();
  	   HttpSession session = request.getSession(true);
  	   System.out.println(status);
  	   System.out.println(status1);
  	  if((status1&&status)==true)
  	  {
  		  a=m.getA();
  		  b=m.getB();
  				  c=m.getC();
  				  d=m.getD();
  				  e=m.getE();
  				  f=m.getF();
  				  g=m.getG();
  				  h=m.getH();
  				  i=m.getI();
  				  j=m.getJ();
  				  k=m.getK();
  				  
  				 a1= m.getA1();
  				 b1= m.getB1();
  				 c1= m.getC1();
  				 d1= m.getD1();
  				  e1=m.getE1();
  				  f1=m.getF1();
  				  g1=m.getG1();
  				  h1=m.getH1();
  				  i1=m.getI1();
  				  j1=m.getJ1();
  				  k1=m.getK1();
  				  
  		 session.setAttribute("a", a);
  		session.setAttribute("b", b);
  		session.setAttribute("c", c);
  		session.setAttribute("d", d);
  		session.setAttribute("e", e);
  		session.setAttribute("f", f);
  		session.setAttribute("g", g);
  		session.setAttribute("h", h);
  		session.setAttribute("i", i);
  		session.setAttribute("j", j);
  		session.setAttribute("k", k);
  		session.setAttribute("a1", a1);
  		session.setAttribute("b1", b1);
  		session.setAttribute("c1", c1);
  		session.setAttribute("d1", d1);
  		session.setAttribute("e1", e1);
  		session.setAttribute("f1", f1);
  		session.setAttribute("g1", g1);
  		session.setAttribute("h1", h1);
  		session.setAttribute("i1", i1);
  		session.setAttribute("j1", j1);
  		session.setAttribute("k1", k1);
  		 
  		 response.sendRedirect("/Onlineportal/samsungmobile.jsp");
  	  }
  	  else
  	  {
  		  response.sendRedirect("/Onlineportal/mobiles.html"); 
  		  
  	  }
    }
	

}
