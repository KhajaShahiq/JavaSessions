package StringManipulation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringConcept {

	public static void main(String[] args) {

		
		String str="This is my java code and i am so happy and i am expert";
		System.out.println(str.length());
		
		
		System.out.println(str.charAt(5));
		
		
		System.out.println(str.indexOf("i"));
		
		System.out.println(str.indexOf("i", str.indexOf("i")+1));
		
		
		String str1="    Kaja shahiquddin     ";
		System.out.println(str1.trim());
		
		String st1="08-01-1996";
		System.out.println(st1.replace("-", "/"));
		
		
		String pop="Java;python;selenium;ruby";
		String p[]= pop.split(";");
		System.out.println(p[0]);
		
		

		String name = "Test Automation Labs";
		System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        
        String domain = "    hello    selenium    ";
        String dom = domain.replaceAll("\\s+", "");
        System.out.println(dom);
        
        String t1 = "your order id is 12345";
        String orderId = t1.replaceAll("\\D+", "");
        System.out.println(orderId);
        
        String t2 = "your user id is 9090 and order id is 12345";
//        String newStr = t2.replaceAll("\\D+", "");
//        System.out.println(newStr);
        
       Pattern pattern = Pattern.compile("\\d+");
       Matcher matcher =  pattern.matcher(t2);
       
//       while(matcher.find()) {
//    	   System.out.println(matcher.group());
//       }
		
      String userId =null;
      String OId= null;
	if(matcher.find())
	{
		userId=matcher.group();
	}
		if(matcher.find())
		{
			OId=matcher.group();
		}
		
		
		System.out.println(userId);
		System.err.println(OId);
		
	       String tr = "Hello!! this is my value .$123333*";
	       String finalValue = tr.replaceAll("[^a-zA-Z0-9\\s]", "");
	       System.out.println(finalValue);

		
	}

}
