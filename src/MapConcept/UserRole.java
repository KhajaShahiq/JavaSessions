package MapConcept;

import java.util.HashMap;

import Exception.MyException;

public class UserRole {
	
	
	public void dologin(String un, String pwd)
	{
		System.out.println("user is logged with :  "  +   un  + " - "  + pwd );
	}
	
	public void dologin(String role)
	{
			
		String creds = getUserCred(role);
		
		String un = creds.split(":")[0].trim();
		String pwd = creds.split(":")[1].trim();
		dologin(un, pwd);
		
	}
	
	private HashMap<String, String> getUserMap()
	{
		HashMap<String, String> userMap=new HashMap<String, String>();
		
		userMap.put("admin", "admin:admin123");
		userMap.put("seller", "seller:seller@123");
		userMap.put("vendor", "vendor:vendor@1234");
		userMap.put("partner", "partner:partner@12390");
		userMap.put("user", "naveen:naveen@1909");	
		return userMap;
	}

	private String getUserCred(String role)
	{
		
		
		if(getUserMap().containsKey(role)) {
		return getUserMap().get(role);	
		}
		else
		{
			throw new MyException("Role not Found");
		}
		
	}
	
	
	public static void main(String[] args) {
		
		
	String role= "user";	
	UserRole app=new UserRole();
	
	app.dologin(role);
	
	//app.dologin("Khaja", "Khaja123");
	
	
	
	
	
	
	
	
	//String user=app.getUserCred(role);
	
//	System.out.println(user);
//		
//	String ur[]=user.split(":");
//	
//	String un=ur[0].trim();
//	String pwd=ur[1].trim();
//	app.dologin(un, pwd);
	
		
	}

}
