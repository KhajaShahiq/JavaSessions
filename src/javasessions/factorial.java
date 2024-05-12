package javasessions;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //5=5*4*3*2*1
		//String is a class in java
		String s1="hello factorial";
		String x="10";
		String y="A";
		
		System.out.println(s1+x);//here + operator is concatnate
		System.out.println(s1+y);
		System.out.println("1"+"2");
		
		char c='a';
		String d= "hello";
		System.out.println(d+c+'a');
		System.out.println('c'+c+d);
		System.out.println("i love \"java\" programming");
		System.out.println("i lave 'java' programming");
		
		byte b1=10;
		byte b2=12;
		//byte b3=b1+b2;  we can't add 2  bytes as java compiler won't allow bcz
		//whatif the byte value increased in future so it won't allow
		int b3=b1+b2;
		System.out.println(b3);
	    int b4=(byte)300;// will get a 44 bcz 256(byte range(-128 to 127)) 300-254=44 number it is a bad practise to intialize
		System.out.println(b4);
		
	}
}
