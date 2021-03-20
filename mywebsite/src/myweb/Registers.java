package myweb;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class Registers extends ActionSupport {
	private String username,password,email,gender,country;
	private int id;
	public String pattern = "(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])(?=\\S+$).{7,}";
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
    		return password;
    	}
    public void setPassword(String password) {
    	
    	if(password.matches(pattern))
    	{
    		this.password = password;
    	}
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    /*public void validate()
    {
    	if(getUsername().length()<1)
    	{
    		addFieldError("username","Username cannot be blank");
    	}
    	if(getPassword().length()<1)
    	{
    		addFieldError("password","Password cannot be blank");
    	}
    	if(getEmail().length()<1)
    	{
    		addFieldError("email","Email id cannot be blank");
    	}
    }*/
    
    		
    public String execute()
    {
        int i = Users.save(this);
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
