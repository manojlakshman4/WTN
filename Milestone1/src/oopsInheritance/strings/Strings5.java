package oopsInheritance.strings;

import java.util.*;

public class Strings5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		int l=s.length();
		System.out.println(s.substring(1,l-1));
	}
}
