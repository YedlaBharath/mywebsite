package myweb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.opensymphony.xwork2.ActionSupport;

public class editform extends ActionSupport {
	String submitType;
	ResultSet rs=null;
	public static Connection getConnection()
    {
        Connection con = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost/example?useSSL=false&serverTimezone=UTC","root","root123");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return con;
    }
	public int edituserdetails(int id,String username,String password,String email,String gender,String country)
	{
		int flag=0;
		try
		{
			Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement("UPDATE registerinfo SET id=?,username=?,password=?,email=?,gender=?,country=?");
			ps.setInt(1, id);
			ps.setString(2, username);
			ps.setString(3, password);
			ps.setString(4, email);
			ps.setString(5, gender);
			ps.setString(6, country);
			flag = ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		return flag;
	}
	public String execute()
	{
		int i = 0;
		if(i>0)
		{
			return "success";
		}
		else
		{
			return "error";
		}
	}
}
