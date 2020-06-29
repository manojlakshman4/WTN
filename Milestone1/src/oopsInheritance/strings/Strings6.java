package oopsInheritance.strings;

import java.util.*;

public class Strings6 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s1=scan.next();
		String s2=scan.next();
		int l1=s1.length();
		int l2=s2.length();
		if(l1>l2) {
			System.out.println(s2.concat(s1).concat(s2));
		}
		else {
			System.out.println(s1.concat(s2).concat(s1));
		}
	}
}
