package javasessions;

public class ShortCircuitOperator {

	public static void main(String[] args) {
		int a=1000;
		int b=1000;
		int c=500;
		int d=800;
		
		if(a>=b && a>c && a>d)
		{
			System.out.println("A is greatest");
		}
		else if(b>c && b>d)
		{
			System.out.println("B is greatest");
		}
		else if (c>d)
		{
			System.out.println("C is greatest");
		}
		else
		{
			System.out.println("D is greatest");
		}
		
		
		int marks=15;
		if(marks<100)
		{
			if(marks>=80 && marks<=90) 
			{
				System.out.println("A grade");
			}
			
		
		else
		{
			if(marks>=95)
			{
				System.out.println("A++ grade");
			}
			if(marks == 100) {
				System.out.println("Eligible for scholarship");
			}
			
			else 
			{
				if(marks<=0&& marks<=10) {
				System.out.println("Fail");
				}
			else if(marks>=11 && marks<=30)
			{
				System.out.println("c grade");
			}
			}
		}
		}
			else {
				System.out.println("Pass correct Number");
			}
		
		
		
	}

}
