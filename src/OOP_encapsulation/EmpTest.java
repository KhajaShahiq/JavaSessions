package OOP_encapsulation;

public class EmpTest {

	public static void main(String[] args) {

		
//		Employee e1= new Employee();
//		
//		e1.setName("Khaja");
//		
//		System.out.println(e1.getName());
		
		Employee e1= new Employee("Khaja", 20, "Hyderabad");
		
		System.out.println(e1.getName() + " " +e1.getAge() + " " + e1.getCity());
		
		
		e1.setAge(30);
		System.out.println(e1.getName() + " " +e1.getAge() + " " + e1.getCity());
	
	
	Browser b1=new Browser();
	b1.launchBrowser();
	
	
	
	
	}
	

}
