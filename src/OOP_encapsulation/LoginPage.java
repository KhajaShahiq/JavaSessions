package OOP_encapsulation;

public class LoginPage {

	
	private String Username;
	private String Password;
	
	public LoginPage(String Username, String Password)
	{
		this.Username=Username;
		this.Password=Password;
	}
	
	
	
	
	public String getUsername() {
		return Username;
	}
	public void setUsername(String Username) {
		this.Username = Username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String Password) {
		this.Password = Password;
	}
	
	
	public void doLogin(String Username) {
		if (isUserValid(Username)) {
			System.out.println("user enters un: " + Username);
			System.out.println("user enters pwd: " + Password);
			System.out.println("user is logged in");
		}

	}
	
	private boolean isUserValid(String Username)
	{
		if(Username.length()>=3)
		{
			System.out.println("Valid User");
			return true;
		}
		else
		{
			System.out.println("Invalid User");
			return false;

		}
	}
	
	
	
	
	
}
