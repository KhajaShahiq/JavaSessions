package Exception;

public class Trycatch {
   
	public static void main(String args[]) {
		
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		try
		{
			System.out.println("Hello");
			System.out.println("Hello");
			System.out.println("Hello");
			int i=9/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("AE excep");
			e.printStackTrace();
		}
		catch(NullPointerException e)
		{
			System.out.println("NPE excep");
			e.printStackTrace();
		}
		System.out.println("Bye");
		
	}
	
	
}
