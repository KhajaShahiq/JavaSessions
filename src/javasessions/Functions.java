package javasessions;

import java.util.ArrayList;
import java.util.Arrays;

public class Functions {
	
	public void test()
	{
		System.out.println("testmethod");
	}
	
	public void testreturn(int days)
	{
		System.out.println("gettin no of weeks");
		int week=days*7;
		System.out.println(week);
		
	}
	
	public int add(int a, int b)
	{
		System.out.println("Sum Function");
		int sum=a+b;
		return sum;
	}
	
	//no input some return
	
	public String getinfo()
	{
		
		System.out.println("get info");
		String str="hello";
		return str;
	}
	
	
	public String[] getDevices() {
		System.out.println("getting devices");
		String devices[] = { "Macbook Pro", "iPad" };
		return devices;
	}

	public ArrayList<String> getUsersList() {
		System.out.println("getting all users");
		ArrayList<String> userList = new ArrayList<String>();
		userList.add("Shiva");
		userList.add("Ravi");
		userList.add("Leena");
		return userList;
	}

	public static void main(String[] args) {
		
		
		Functions Fu= new Functions();
		Fu.test();
		Fu.testreturn(5);
		int m=Fu.add(10, 20);
		System.out.println(m);
		
		String str=Fu.getinfo();
		System.out.println(str);
		
		
		String Devs[]=Fu.getDevices();
		System.out.println(Arrays.toString(Devs));
		
		ArrayList<String> Ulist=Fu.getUsersList();
		System.out.println(Ulist);
		Ulist.add("Khaja");
		System.out.println(Ulist);
		
	}

}
