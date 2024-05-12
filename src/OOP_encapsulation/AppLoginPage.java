package OOP_encapsulation;

public class AppLoginPage {

	public static void main(String[] args) {

		LoginPage lp=new LoginPage("Khaja", "Khaja123");
		
		
		lp.doLogin(lp.getUsername());
		
		
	}

}
