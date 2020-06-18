package javaFundamentals.flowControlStatements;

public class Ex9 {
	public static void main(String[] args) {
		int age=Integer.parseInt(args[1]);
		char c=args[0].charAt(0);
		if(c=='F'&&age<=58) {
			System.out.println("8.2%");
		}
		else if(c=='F'&&age>58) {
			System.out.println("9.2%");
		}
		else if(c=='M'&&age<=58) {
			System.out.println("8.4%");
		}
		else {
			System.out.println("10.5%");
		}
	}
}
