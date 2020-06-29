package oopsInheritance.strings;

import java.util.*;

public class Strings3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		int l=s.length();
		String sub=s.substring(0,2);
		for(int i=1;i<l;i++) {
			sub=sub.concat(s.substring(0,2));
		}
		System.out.println(sub);
	}
}
