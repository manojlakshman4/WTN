package oopsInheritance.strings;

import java.util.*;

public class Strings8 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		int l=s.length();
		int n=s.indexOf("*");
		if(n-1<=0) {
			System.out.println(s.substring(n+2,l));
		}
		else if(n+1>=l-1) {
			System.out.println(s.substring(0,n-1));
		}
		else {
			System.out.println(s.substring(0,n-1).concat(s.substring(n+2,l)));
		}
	}
}
