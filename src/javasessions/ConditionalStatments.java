package javasessions;

public class ConditionalStatments {

	public static void main(String[] args) {
		
		int x=10;
		int y=20;
		
		System.out.println(x<y);
		
		if(x>y)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("false");
		}

		
		int p1=100;
		int p2=200;
		if(p1!=p2)
		{
			System.out.println("selenium");
		
		}
		
		String str= "chrom";
		
		if(str.equals("chrome"))
		{
			System.out.println("chrome browser");
		}
		else if(str.equals("safari"))
		{
			System.out.println("safari browser");
		}
		else if(str.equals("edge"))
		{
			System.out.println("edge browser");
		}
		else
		{
			System.out.println("pass correct browser");
		}
	}

}
