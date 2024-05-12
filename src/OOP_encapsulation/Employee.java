package OOP_encapsulation;

public class Employee {

	
	private String name;
	private int age;
	private String City;
	
	
	
	public Employee(String name, int age, String city)
	{
		this.name=name;
		this.age= age;
		this.City=city;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	
	
}
