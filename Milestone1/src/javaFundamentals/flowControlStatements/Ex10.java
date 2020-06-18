package javaFundamentals.flowControlStatements;

public class Ex10 {
	public static void main(String[] args) {
		char a=args[0].charAt(0);
		if(a>=65&&a<=90) {
			a+=32;
		}
		else {
			a-=32;
		}
		System.out.println(a);
	}
}
