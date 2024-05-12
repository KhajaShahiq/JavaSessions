package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b=new BMW();
		
		b.startcar();  //overridden;
		b.stopcar(); //inherited
		b.refuel();
		b.engine();
		b.autoParking();
		
		System.out.println("-----------");
		
		Car c=new Car();
		c.startcar();
		c.stopcar();
		
		System.out.println("-----------");
		
		Audi au=new Audi();
		au.startcar();
		au.theftsafety();
		au.engine();
	}

}
