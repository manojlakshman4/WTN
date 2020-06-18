package javaFundamentals.flowControlStatements;

public class Ex20 {
	public static void main(String[] args) {
		char a[]=args[0].toCharArray();
		int c=0;
		for(int i=0;i<a.length/2;i++) {
			if(a[i]!=a[a.length-1-i]) {
				c++;
			}
		}
		if(c==0) {
			System.out.println(args[0]+" is a palindrome");
		}
		else {
			System.out.println(args[0]+" is not a palindrome");
		}
	}
}
