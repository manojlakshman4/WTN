package javaFundamentals.flowControlStatements;

public class Ex8 {
	public static void main(String[] args) {
		char a=args[0].charAt(0);
		if(a>=48&&a<=57) {
			System.out.println("Digit");
		}
		else if((a>=65&&a<=90)||(a>=95&&a<=122)) {
			System.out.println("Alphabhet");
		}
		else {
			System.out.println("Special Character");
		}
	}
}
