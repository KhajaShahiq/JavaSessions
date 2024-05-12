package StringManipulation;

public class StringbuffervsStringbuilder {

	public static void main(String[] args) {

		String tr = "Hello";
		tr.concat("selenium");//HelloSelenium
		tr.concat("testing");//HelloSeleniumTesting
		System.out.println(tr);
		
		//mutable
		StringBuilder sb = new StringBuilder("Hello");
		sb.append("selenium");
		sb.append("testing");
		System.out.println(sb);
		
		
		
		
		
	}

}
