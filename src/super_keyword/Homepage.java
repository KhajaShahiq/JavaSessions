package super_keyword;

public class Homepage extends Webpage{
	
	public Homepage()
	{
		super();
		System.out.println("HP-- DEFAULCONSTRUCTOR");
	}
	
	
	public Homepage(int i)
	{
		System.out.println("HP--"  +i);
		
	}
	@Override
	public void Pagepanel()
	{
		
		System.out.println("HomePage -- Panel");
	}
	
	public static void billing() {
		System.out.println("homepage -- billing");
	}
	
	
	@Override
	public void calculate_timeout()
	{
		super.calculate_timeout();
		System.out.println("homepage  --- Timeout");
		
		super.logo();
		System.out.println(super.speed);
		Webpage.billing();
		Homepage.billing();
		super.Pagepanel();
	}
	
	
	
}
