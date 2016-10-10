package blog.domain;

public class UserForm {
	
	private String userName;
	
	private String password;
	
	public void setuserName(String userName){this.userName = userName;}
	public void setpassword(String password){this.password = password;}
	
	public String getuserName(){return userName;}
	public String getpassword(){return password;}
}
