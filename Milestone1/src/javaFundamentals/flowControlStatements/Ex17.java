package javaFundamentals.flowControlStatements;

public class Ex17 {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int sum=0;
		for(;a!=0;) {
			sum+=a%10;
			a/=10;
		}
		System.out.println(sum);
	}
}
