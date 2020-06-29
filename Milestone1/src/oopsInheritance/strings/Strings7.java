package oopsInheritance.strings;

import java.util.*;

public class Strings7 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		int l=s.length();
		if(s.substring(0,1).equals("x")) {
			s=s.substring(1,l);
			if(s.substring(l-2,l-1).equals("x")) {
				s=s.substring(0,l-2);
			}
		}
		else {
			if(s.substring(l-1,l).equals("x")) {
				s=s.substring(0,l-1);
			}
		}
		System.out.println(s);
	}
}
