package javasessions;

public class Static_Variables {
    
	//bike 
	String name;
	String color;
	int price;
	static final int wheels=2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_Variables n1= new Static_Variables();
		n1.name="pulsar";
		n1.color="red";
		n1.price=1000;
		System.out.println(n1.name+" "+n1.color+" "+n1.price+" "+Static_Variables.wheels);
		
		Static_Variables n2= new Static_Variables();
		n2.name="splender";
		n2.color="black";
		n2.price=1000;
		System.out.println(n2.name+" "+n2.color+" "+n2.price+" "+Static_Variables.wheels);
		
		Static_Variables n3= new Static_Variables();
		n3.name="pulsar";
		n3.color="red";
		n3.price=1000;
		System.out.println(n3.name+" "+n3.color+" "+n3.price+" "+Static_Variables.wheels);

	}

}
