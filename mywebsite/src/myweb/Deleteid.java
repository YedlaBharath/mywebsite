package myweb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.opensymphony.xwork2.ActionSupport;

public class Deleteid extends ActionSupport {
	int id;
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
	public int delete(int id)
	{
		int flag=0;
		try
		{
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement("DELETE FROM registerinfo WHERE id=?");
			ps.setInt(1, id);
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
		int i = delete(id);
		if(i>0)
		{
			return ActionSupport.SUCCESS;
		}
		else
		{
			return ActionSupport.ERROR;
		}
	}
}
