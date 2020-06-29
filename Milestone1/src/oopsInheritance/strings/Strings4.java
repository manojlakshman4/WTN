package oopsInheritance.strings;

import java.util.*;

public class Strings4 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		int l=s.length();
		if(l%2==0) {
			System.out.println(s.substring(0,l/2));
		}
		else {
			System.out.println("null");
		}
	}
}
