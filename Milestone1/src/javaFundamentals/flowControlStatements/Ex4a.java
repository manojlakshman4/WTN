package javaFundamentals.flowControlStatements;

public class Ex4a {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		if(a>0) {
			System.out.println("Positive");
		}
		else if(a<0) {
			System.out.println("Negitive");
		}
		else {
			System.out.println("Zero");
		}
	}
}
