package javaFundamentals.flowControlStatements;

public class Ex4b {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		boolean B=((a%10)==(b%10));
		System.out.println(B);
	}
}
