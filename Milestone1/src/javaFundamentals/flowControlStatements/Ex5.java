package javaFundamentals.flowControlStatements;

public class Ex5 {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		if(a%2!=0) {
			System.out.println("odd");
		}
		else {
			System.out.println("even");
		}
	}
}
