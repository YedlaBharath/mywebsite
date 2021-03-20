package myweb;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.opensymphony.xwork2.ActionSupport;

public class Records extends ActionSupport {
	private List<Registers> list;
    
    public List<Registers> getList() {
		return list;
	}
	public void setList(List<Registers> list) {
		this.list = list;
	}
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
    public List<Registers> getRecords()
    {
    	list = new ArrayList<Registers>();
    	try
    	{
    		Connection con = getConnection();
    		PreparedStatement ps = con.prepareStatement("SELECT * FROM registerinfo");
    		ResultSet rs = ps.executeQuery();
    		while(rs.next())
    		{
    			Registers r = new Registers();
    			r.setId(rs.getInt(1));
    			r.setUsername(rs.getString(2));
    			r.setPassword(rs.getString(3));
    			r.setEmail(rs.getString(4));
    			r.setGender(rs.getString(5));
    			r.setCountry(rs.getString(6));
    			list.add(r);
    		}
    	}
    	catch(Exception e)
    	{
    		System.out.print(e);
    	}
    	return list;
    }
    public String execute()
    {
    	List<Registers> list = getRecords();
    	if(list!=null)
    	{
    		return "success";
    	}
    	else
    	{
    		return "error";
    	}
    }
}
