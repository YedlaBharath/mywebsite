package myweb;

import com.opensymphony.xwork2.ActionSupport;
import myweb.Registers.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Users extends ActionSupport {
    
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
    public static int save(Registers r) {

        int status = 0;
        try {
            Connection con=getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO registerinfo(id,username,password,email,gender,country) VALUES(?,?,?,?,?,?)");
            
            ps.setInt(1, r.getId());
            ps.setString(2, r.getUsername());
            ps.setString(3, r.getPassword());
            ps.setString(4, r.getEmail());
            ps.setString(5, r.getGender());
            ps.setString(6, r.getCountry());
            status = ps.executeUpdate();
            con.close();
        }
        catch (SQLException e)
        {
        	System.out.print(e);
        }
        return status;
    }
}
