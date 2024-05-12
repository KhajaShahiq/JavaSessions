package javasessions;

public class User {
	
	
	int age;
	String name;
	String area;
	Float salary;
	boolean isactive;
	
	public static void main(String[] args) {
	
	User u1=new User();
	u1.age=10;
	u1.name= "Khaja";
	u1.area="Jagitial";
	u1.isactive=false;
	u1.salary=5000.0f;
	System.out.println(u1.age);
	System.out.println(u1.name);
	System.out.println(u1.area);
	
	System.out.println(u1.salary);
	System.out.println(u1.isactive);
	}
		

}
