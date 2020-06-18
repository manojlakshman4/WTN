package javaFundamentals.arrays;

public class Ex21 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int[] a=new int[n];
		int sum=0;
		for(int i=1;i<=n;i++) {
			a[i-1]=Integer.parseInt(args[i]);
			sum+=a[i-1];
		}
		double avg=(double)sum/n;
		System.out.println("Sum is "+sum);
		System.out.println("Average is "+avg);
	}
}
