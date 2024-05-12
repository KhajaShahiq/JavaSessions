package javasessions;

public class Customer {
	
	
	String name;
	int age;
	String city;

	public static void main(String[] args) {
		Customer c1= new Customer();
		c1.name="Khaja";
		c1.age=15;
		c1.city="Hyderabad";
		
		Customer c2= new Customer();
		c2.name="Khaja123";
		c2.age=18;
		c2.city="secunderabad";
		
		
		
		System.out.println(c1.name  +" " + c1.age + "  " +c1.city);
		System.out.println(c2.name  +" " + c2.age + "  " +c2.city);
	}

}
