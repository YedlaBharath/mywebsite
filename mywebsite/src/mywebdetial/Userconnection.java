package mywebdetial;

import java.sql.*;
public class Userconnection {
public static Connection getConnection()
{
	Connection conn=null;
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost/example?useSSL=false&serverTimezone=UTC","root","root123");
	}
	catch(Exception e)
	{
		System.out.print(e);
	}
	return conn;
}
public static boolean login(String email,String password)
{
	boolean flag=false;
	try
	{
		Connection conn = getConnection();
		PreparedStatement ps = conn.prepareStatement("SELECT * FROM registerinfo WHERE email=? AND password=?");
		ps.setString(1,email);
		ps.setString(2,password);
		ResultSet rs = ps.executeQuery();
		flag=rs.next();
		conn.close();
	}
	catch(Exception e)
	{
		System.out.print(e);
	}
	return flag;
}
}
