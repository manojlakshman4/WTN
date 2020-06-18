package javaFundamentals.flowControlStatements;

public class Ex19 {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=0;
		while(a!=0) {
			b=(b*10)+(a%10);
			a=a/10;
		}
		System.out.println(b);
	}
}
