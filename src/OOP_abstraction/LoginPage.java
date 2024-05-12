package OOP_abstraction;

public class LoginPage extends Page {

	@Override
	public void title() {
		System.out.println("Title");
		
	}

	@Override
	public void url() {
		System.out.println("URL");
	}

	public void dologin(String username, String Password)
	{
		System.out.println(username +" " + Password);
	}
	
	
	
	
}
