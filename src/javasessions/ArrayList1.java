package javasessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> str= new ArrayList<String>();
		str.add("Khaja");
		str.add("Shahiquddin");
		System.out.println(str);
		
		ArrayList<Object> obj=new ArrayList<Object>();
		obj.add(10);
		obj.add("Khaja");
		obj.add(10.0);
		obj.add(true);
		obj.add('K');
		System.out.println(obj.size());
		System.out.println(obj);	
		
		ArrayList<String> str1=new ArrayList<String>(Arrays.asList("Chrome", "Edge"));
		System.out.println(str1.get(0));
		System.out.println(str1.get(1));
		System.out.println(str.size());
		
		
		List<String> beta = new ArrayList<String>(Collections.emptyList());
		System.out.println(beta);  // Prints: []
		beta.add("added element");
		System.out.println(beta);  // Prints: [added element]
		
}

}
