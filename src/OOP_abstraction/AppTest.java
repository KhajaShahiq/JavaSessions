package OOP_abstraction;

public class AppTest {

	public static void main(String[] args) {

		
		LoginPage lp=new LoginPage();
		
		lp.title();
		lp.url();
		lp.pageloadingtime();
		Page.displaylogo();
		lp.footers();
		
		lp.dologin("Khaja", "Shahiq@123");
		
		
		
		
	}

}
