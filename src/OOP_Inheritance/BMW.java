package OOP_Inheritance;

public class BMW extends Car
{
	
	//when you have a method in parent class and same method is child class
	// same method name
	// same method with same parameters, with same sequence and same type parameters
	// same return type
	
	
	@Override
	public void startcar()
	{
		System.out.println("bmw startcar");
		
		
	}

	public void autoParking()
	{
		System.out.println("BMW Autoparking");
	}
	
}
