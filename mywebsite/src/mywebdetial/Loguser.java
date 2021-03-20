package mywebdetial;

import com.opensymphony.xwork2.ActionSupport;

public class Loguser extends ActionSupport {
	private String emailid,pass;
	
	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String execute()
	{
		if(Userconnection.login(emailid,pass))
		{
			return ActionSupport.SUCCESS;
		}
		else
		{
			return ActionSupport.ERROR;
		}
	}
}
