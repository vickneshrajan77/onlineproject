package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Model 
{
	private String fname;
	private String lname;
	private String dob;
	private String email;
	private String phoneno;
	private String password;
	private String cpsd;
	private Connection con;
	private ResultSet res;
	private PreparedStatement pstmt;
	private Statement stmt;
	private ResultSet res1;
	private String a;
	private  String b;
	private String c;
	private  String d; 
	private String e;
	private String f;
	private String g;
	private String h;
	private String i;
	private String j;
	private String k;
	private Statement stmt1;
	private ResultSet res2;
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
	private Statement stmt2;
	private ResultSet res3;
	private Statement stmt3;
	private ResultSet res4;
	private String a2;
	private String b2;
	private String c2;
	private String e2;
	private String d2;
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
	private PreparedStatement pst;
	private ResultSet result1;
	private Statement pstmm;
	private ResultSet rest;
	private String b4;
	private String a4;
	private String c4;
	private String d4;
	private String e4;
	private PreparedStatement pstm;
	
	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public String getDob() {
		return dob;
	}

	public String getEmail() {
		return email;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public String getPassword() {
		return password;
	}

	public String getCpsd() {
		return cpsd;
	}

	public Connection getCon() {
		return con;
	}

	public ResultSet getRes() {
		return res;
	}

	public PreparedStatement getPstmt() {
		return pstmt;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setCpsd(String cpsd) {
		this.cpsd = cpsd;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public void setRes(ResultSet res) {
		this.res = res;
	}

	public void setPstmt(PreparedStatement pstmt) {
		this.pstmt = pstmt;
	}
	public Statement getStmt() {
		return stmt;
	}

	public ResultSet getRes1() {
		return res1;
	}

	public String getA() {
		return a;
	}

	public String getB() {
		return b;
	}

	public String getC() {
		return c;
	}

	public String getD() {
		return d;
	}

	public String getE() {
		return e;
	}

	public String getF() {
		return f;
	}

	public String getG() {
		return g;
	}

	public String getH() {
		return h;
	}

	public String getI() {
		return i;
	}

	public String getJ() {
		return j;
	}

	public String getK() {
		return k;
	}

	public void setStmt(Statement stmt) {
		this.stmt = stmt;
	}

	public void setRes1(ResultSet res1) {
		this.res1 = res1;
	}

	public void setA(String a) {
		this.a = a;
	}

	public void setB(String b) {
		this.b = b;
	}

	public void setC(String c) {
		this.c = c;
	}

	public void setD(String d) {
		this.d = d;
	}

	public void setE(String e) {
		this.e = e;
	}

	public void setF(String f) {
		this.f = f;
	}

	public void setG(String g) {
		this.g = g;
	}

	public void setH(String h) {
		this.h = h;
	}

	public void setI(String i) {
		this.i = i;
	}

	public void setJ(String j) {
		this.j = j;
	}

	public void setK(String k) {
		this.k = k;
	}
	public String getA1() {
		return a1;
	}

	public void setA1(String a1) {
		this.a1 = a1;
	}

	public String getB1() {
		return b1;
	}

	public void setB1(String b1) {
		this.b1 = b1;
	}

	public String getC1() {
		return c1;
	}

	public void setC1(String c1) {
		this.c1 = c1;
	}

	public String getD1() {
		return d1;
	}

	public void setD1(String d1) {
		this.d1 = d1;
	}

	public String getE1() {
		return e1;
	}

	public void setE1(String e1) {
		this.e1 = e1;
	}

	public String getF1() {
		return f1;
	}

	public void setF1(String f1) {
		this.f1 = f1;
	}

	public String getG1() {
		return g1;
	}

	public void setG1(String g1) {
		this.g1 = g1;
	}

	public String getH1() {
		return h1;
	}

	public void setH1(String h1) {
		this.h1 = h1;
	}

	public String getI1() {
		return i1;
	}

	public void setI1(String i1) {
		this.i1 = i1;
	}

	public String getJ1() {
		return j1;
	}

	public void setJ1(String j1) {
		this.j1 = j1;
	}

	public String getK1() {
		return k1;
	}

	public void setK1(String k1) {
		this.k1 = k1;
	}

	public String getB4() {
		return b4;
	}

	public void setB4(String b4) {
		this.b4 = b4;
	}

	public String getA4() {
		return a4;
	}

	public void setA4(String a4) {
		this.a4 = a4;
	}

	public String getC4() {
		return c4;
	}

	public void setC4(String c4) {
		this.c4 = c4;
	}

	public String getD4() {
		return d4;
	}

	public void setD4(String d4) {
		this.d4 = d4;
	}

	public String getE4() {
		return e4;
	}

	public void setE4(String e4) {
		this.e4 = e4;
	}

		
	public Model()
	{
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		 con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
		 System.out.println("success");
		}
		catch(Exception e)
		{
			System.out.println("not established");
		}
		
	}
	
	public boolean login()
	{
		try
		{
		  pstmt = con.prepareStatement("SELECT * FROM CUSTOMER WHERE Email=? and Password=?");
		 pstmt.setString(1, email);
		 pstmt.setString(2, password);
		 res=pstmt.executeQuery();
			System.out.println("query success");
			
			if(res.next()==true)
			{
				phoneno=res.getString("PHONENO");
				return true;
			}

		}
		catch(Exception e)
		{
			System.out.println("query not success");
		}
		return false;
			}

	
	public boolean samsung() 
	
	{
		try
		{
			stmt=con.createStatement();
			res1=stmt.executeQuery("select * from samsung natural join specification");
			
			if(res1.next()==true)
			{
				a=res1.getString("PRODUCT_NAME");
				 b=res1.getString("VARIENT_COLOR");
			 c=res1.getString("PRICE");
				 d=res1.getString("DISCOUNT");
			 e=res1.getString("DISCOUNTED_PRICE");
				 f=res1.getString("RATING");
				 g=res1.getString("COLOR");
				 h=res1.getString("RAM");
				 i=res1.getString("STORAGE");
				 j=res1.getString("CAMERA");
				 k=res1.getString("BATTERY");
				return true;
				

			}
		}
		catch(Exception e)
		{
			System.out.println("not running join");
		}
		return false;
	}

	
	
public boolean samsung1() 
	
	{
		try
		{
			stmt1=con.createStatement();
			res2=stmt1.executeQuery("select * from samsung natural join specification where SPECIFICATION_NO=0124");
			
			if(res2.next())
			{
				a1=res2.getString("PRODUCT_NAME");
				 b1=res2.getString("VARIENT_COLOR");
			 c1=res2.getString("PRICE");
				 d1=res2.getString("DISCOUNT");
			 e1=res2.getString("DISCOUNTED_PRICE");
				 f1=res2.getString("RATING");
				 g1=res2.getString("COLOR");
				 h1=res2.getString("RAM");
				 i1=res2.getString("STORAGE");
				 j1=res2.getString("CAMERA");
				 k1=res2.getString("BATTERY");
				return true;
				

			}
		}
		catch(Exception e)
		{
			System.out.println("not running1 join");
		}
		return false;
	}


	
public boolean vivo() 

{
	try
	{
		stmt2=con.createStatement();
		res3=stmt2.executeQuery("select * from vivo natural join specification");
		
		if(res3.next()==true)
		{
			a2=res3.getString("PRODUCT_NAME");
			 b2=res3.getString("VARIENT_COLOR");
		 c2=res3.getString("PRICE");
			 d2=res3.getString("DISCOUNT");
		 e2=res3.getString("DISCOUNTED_PRICE");
			 f2=res3.getString("RATING");
			 g2=res3.getString("COLOR");
			 h2=res3.getString("RAM");
			 i2=res3.getString("STORAGE");
			 j2=res3.getString("CAMERA");
			 k2=res3.getString("BATTERY");
			return true;
			

		}
	}
	catch(Exception e)
	{
		System.out.println("not running join");
	}
	return false;
}



public boolean vivo1() 

{
	try
	{
		stmt3=con.createStatement();
		res4=stmt3.executeQuery("select * from vivo natural join specification where SPECIFICATION_NO=0124");
		
		if(res4.next())
		{
			a3=res4.getString("PRODUCT_NAME");
			 b3=res4.getString("VARIENT_COLOR");
		 c3=res4.getString("PRICE");
			 d3=res4.getString("DISCOUNT");
		 e3=res4.getString("DISCOUNTED_PRICE");
			 f3=res4.getString("RATING");
			 g3=res4.getString("COLOR");
			 h3=res4.getString("RAM");
			 i3=res4.getString("STORAGE");
			 j3=res4.getString("CAMERA");
			 k3=res4.getString("BATTERY");
			return true;
			

		}
	}
	catch(Exception e)
	{
		System.out.println("not running1 join");
	}
	return false;
}

public String getA2() {
	return a2;
}

public void setA2(String a2) {
	this.a2 = a2;
}

public String getB2() {
	return b2;
}

public void setB2(String b2) {
	this.b2 = b2;
}

public String getC2() {
	return c2;
}

public void setC2(String c2) {
	this.c2 = c2;
}

public String getE2() {
	return e2;
}

public void setE2(String e2) {
	this.e2 = e2;
}

public String getD2() {
	return d2;
}

public void setD2(String d2) {
	this.d2 = d2;
}

public String getF2() {
	return f2;
}

public void setF2(String f2) {
	this.f2 = f2;
}

public String getG2() {
	return g2;
}

public void setG2(String g2) {
	this.g2 = g2;
}

public String getH2() {
	return h2;
}

public void setH2(String h2) {
	this.h2 = h2;
}

public String getI2() {
	return i2;
}

public void setI2(String i2) {
	this.i2 = i2;
}

public String getJ2() {
	return j2;
}

public void setJ2(String j2) {
	this.j2 = j2;
}

public String getK2() {
	return k2;
}

public void setK2(String k2) {
	this.k2 = k2;
}

public String getA3() {
	return a3;
}

public void setA3(String a3) {
	this.a3 = a3;
}

public String getB3() {
	return b3;
}

public void setB3(String b3) {
	this.b3 = b3;
}

public String getC3() {
	return c3;
}

public void setC3(String c3) {
	this.c3 = c3;
}

public String getD3() {
	return d3;
}

public void setD3(String d3) {
	this.d3 = d3;
}

public String getE3() {
	return e3;
}

public void setE3(String e3) {
	this.e3 = e3;
}

public String getF3() {
	return f3;
}

public void setF3(String f3) {
	this.f3 = f3;
}

public String getG3() {
	return g3;
}

public void setG3(String g3) {
	this.g3 = g3;
}

public String getH3() {
	return h3;
}

public void setH3(String h3) {
	this.h3 = h3;
}

public String getI3() {
	return i3;
}

public void setI3(String i3) {
	this.i3 = i3;
}

public String getJ3() {
	return j3;
}

public void setJ3(String j3) {
	this.j3 = j3;
}

public String getK3() {
	return k3;
}

public void setK3(String k3) {
	this.k3 = k3;
}

public boolean a()
{
	try {
		pst=con.prepareStatement("insert into orders values(?,?,?,?)");
		pst.setString(1,phoneno);
		pst.setString(2, a);
		pst.setString(3, b);
		pst.setString(4, e);
		int row = pst.executeUpdate();
		if(row==0)
		{
			return false;
		}
		
		} 
	
	catch (Exception e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return true;
	
}
public boolean aa()
{
	try {
		pst=con.prepareStatement("insert into CHECKLIST values(?,?,?,?)");
		pst.setString(1,phoneno);
		pst.setString(2, a);
		pst.setString(3, b);
		pst.setString(4, e);
		int row = pst.executeUpdate();
		if(row==0)
		{
			return false;
		}
		
		} 
	
	catch (Exception e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return true;
	
}
	
public boolean b()
{
	try {
		pst=con.prepareStatement("insert into orders values(?,?,?,?)");
		pst.setString(1,phoneno);
		pst.setString(2, a1);
		pst.setString(3, b1);
		pst.setString(4, e1);
		int row = pst.executeUpdate();
		if(row==0)
		{
			return false;
		}
		
		} 
	
	catch (Exception e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return true;
	
}
public boolean bb()
{
	try {
		pst=con.prepareStatement("insert into CHECKLIST values(?,?,?,?)");
		pst.setString(1,phoneno);
		pst.setString(2, a1);
		pst.setString(3, b1);
		pst.setString(4, e1);
		int row = pst.executeUpdate();
		if(row==0)
		{
			return false;
		}
		
		} 
	
	catch (Exception e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return true;
	
}
	
public boolean c()
{
	try {
		pst=con.prepareStatement("insert into orders values(?,?,?,?)");
		pst.setString(1,phoneno);
		pst.setString(2, a2);
		pst.setString(3, b2);
		pst.setString(4, e2);
		int row = pst.executeUpdate();
		if(row==0)
		{
			return false;
		}
		
		} 
	
	catch (Exception e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return true;
	
}
public boolean cc()
{
	try {
		pst=con.prepareStatement("insert into CHECKLIST values(?,?,?,?)");
		pst.setString(1,phoneno);
		pst.setString(2, a2);
		pst.setString(3, b2);
		pst.setString(4, e2);
		int row = pst.executeUpdate();
		if(row==0)
		{
			return false;
		}
		
		} 
	
	catch (Exception e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return true;
	
}
	
public boolean d()
{
	try {
		pst=con.prepareStatement("insert into orders values(?,?,?,?)");
		pst.setString(1,phoneno);
		pst.setString(2, a3);
		pst.setString(3, b3);
		pst.setString(4, e3);
		int row = pst.executeUpdate();
		if(row==0)
		{
			return false;
		}
		
		} 
	
	catch (Exception e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return true;
	
}
public boolean dd()
{
	try {
		pst=con.prepareStatement("insert into CHECKLIST values(?,?,?,?)");
		pst.setString(1,phoneno);
		pst.setString(2, a3);
		pst.setString(3, b3);
		pst.setString(4, e3);
		int row = pst.executeUpdate();
		if(row==0)
		{
			return false;
		}
		
		} 
	
	catch (Exception e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return true;
	
}
	
	public boolean myacc()
	{
		try {
		pstm=con.prepareStatement("select * from customer where PHONENO=?");
		pstm.setString(1, phoneno);
		rest=pstm.executeQuery();
	   
		if(rest.next())
		{
			
				a4=rest.getString("FIRST_NAME");
				 b4=rest.getString("LAST_NAME");
			 c4=rest.getString("D.O.B");
				 d4=rest.getString("EMAIL");
			 e4=rest.getString("PHONENO");
	
			 return true;
	}
		}
		catch(Exception e)
		{
			System.out.println("myacc not ok");
		}
		return false;
	
	
	}
	public ArrayList checklist() throws SQLException
	 {
		 @SuppressWarnings("rawtypes")
		ArrayList al=new ArrayList(); 
		pstmt=con.prepareStatement("SELECT * FROM CHECKLIST WHERE PHONE_NO=?");
		pstmt.setString(1,phoneno );
		res=pstmt.executeQuery();
		while(res.next()==true)
		{
			String temp=res.getString(2);
			al.add(temp);
			String temp1= res.getString(3);
			al.add(temp1);
			String temp2= res.getString(4);
			al.add(temp2);
		}
		return al;
	 }
	public ArrayList orders() throws SQLException
	 {
		 @SuppressWarnings("rawtypes")
		ArrayList al=new ArrayList(); 
		pstmt=con.prepareStatement("SELECT * FROM ORDERS WHERE PHONE_NO=?");
		pstmt.setString(1, phoneno);
		res=pstmt.executeQuery();
		while(res.next()==true)
		{
			String temp=res.getString(2);
			al.add(temp);
			String temp1= res.getString(3);
			al.add(temp1);
			String temp2= res.getString(4);
			al.add(temp2);
		}
		return al;
	 }	

}
