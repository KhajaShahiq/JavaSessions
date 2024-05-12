package javasessions;

public class Hellojava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {12,23,34,45,56};
		int sum=0;
		for(int i=0; i<arr.length; i++){
			sum += arr[i];
		}
		System.out.println(sum);
	int num[]= {10,20,30,45};
	int count=num.length-1;
	for (int e:num) {
		e=count;
		System.out.println(num[e]);
		count--;
		}
	int i=10;
	while(i>0) {
		i--;
		System.out.println(i);
		}
	int j=10;
	do {
		System.out.println(j);
		j--;
	}while(j>0);
	
	
	}
}
