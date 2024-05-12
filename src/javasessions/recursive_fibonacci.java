package javasessions;

public class recursive_fibonacci {
	static int n1=0,n2=1,n3=0;
	static void rec_fib(int count) {
		if(count>0) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(""+n3);
			rec_fib(count-1);
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0 1 1 2 3 5
        int count=10;
        System.out.println(n1+"\n"+n2);
        rec_fib(count-1);

	}

}
