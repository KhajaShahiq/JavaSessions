package javasessions;

public class Car {
	
	
	String name;
	String licensenum;
	double price;
	String colour;
	static final int wheels=4;
	

	public static void main(String[] args) {
	
		Car c1=new Car();
		c1.colour="Pink";
		c1.name="BMW";
		c1.price=5000;
		c1.licensenum="1234";

		
		Car c2=new Car();
		c2.colour="White";
		c2.name="Audi";
		c2.price=9000;
		c2.licensenum="7234";
		
		Car c3=new Car();
		c3.colour="black";
		c3.name="ferrari";
		c3.price=83000;
		c3.licensenum="3236";
		
		
		
		System.out.println(c1.name+ "  " +c1.licensenum+ " "+  c1.price+ " "+ c1.colour+ " "+ Car.wheels);

		
	}

}
