package p1;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Checklist extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	public void service(HttpServletRequest request,HttpServletResponse response ) throws IOException
	{
		HttpSession session=request.getSession();
		String phoneno=(String) session.getAttribute("phoneno");
		Model m = new Model();
		m.setPhoneno(phoneno);
		try {
			ArrayList al =m.checklist();
			
			if(al.isEmpty()==true)
			{
				response.sendRedirect("/Onlineportal/checkfailed.jsp");
			}
			else
			{
				session.setAttribute("al", al);
				response.sendRedirect("/Onlineportal/checklist.jsp");
			}
			
			
			
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
   }
