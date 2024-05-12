package super_keyword;

public class Webpage extends Page {

	
	public Webpage()
	{
		System.out.println("wp --- default Constructor");
	}
	
	
	public Webpage(int i)
	{
		System.out.println("WP"   +i);
	}
	
	public int speed=10;
	
	public void calculate_timeout()
	{
		System.out.println("webpage  --- Timeout");
	}
	

	public final void logo() {
	System.out.println("webpage -- logo");
	}

	public static void billing() {
	System.out.println("webpage -- billing");
	}


	
}

