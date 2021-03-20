package myweb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class Searchname extends ActionSupport {
private List<Registers> list;

public List<Registers> getList() {
	return list;
}
public void setList(List<Registers> list) {
	this.list = list;
}
private String username;

public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public static Connection getConnection()
{
    Connection con = null;
    try
    {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        con = DriverManager.getConnection("jdbc:mysql://localhost/example?"+"user=root&password=root123");
    }
    catch (Exception e)
    {
        e.printStackTrace();
    }
    return con;
}
public List<Registers> search(Registers u)
{
	list = new ArrayList<Registers>();
	try 
	{
		Connection con = getConnection();
		PreparedStatement ps = con.prepareStatement("SELECT * FROM registerinfo WHERE username LIKE '?'");
		ps.setString(1, u.getUsername()+"%");
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			Registers r = new Registers();
			r.setId(rs.getInt("id"));
			r.setUsername(rs.getString("username"));
			r.setPassword(rs.getString("password"));
			r.setEmail(rs.getString("email"));
			r.setGender(rs.getString("gender"));
			r.setCountry(rs.getString("country"));
			list.add(r);
		}
		con.close();
	}
	catch (Exception e)
	{
		System.out.print(e);
	}
	return list;
}
public String execute()
{
	if(list != null)
	{
		return ActionSupport.SUCCESS;
	}
	else
	{
		return ActionSupport.ERROR;
	}
}
}
