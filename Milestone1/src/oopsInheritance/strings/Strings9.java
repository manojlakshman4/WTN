package oopsInheritance.strings;

import java.util.*;

public class Strings9 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s1=scan.next();
		String s2=scan.next();
		String s="";
		int l1=s1.length();
		int l2=s2.length();
		if(l1>=l2) {
			for(int i=0;i<l2;i++) {
				s=s.concat(s1.charAt(i)+"").concat(s2.charAt(i)+"");
			}
			s=s.concat(s1.substring(l2,l1));
		}
		else {
			for(int i=0;i<l1;i++) {
				s=s.concat(s1.charAt(i)+"").concat(s2.charAt(i)+"");
			}
			s=s.concat(s2.substring(l1,l2));
		}
		System.out.println(s);
	}
}
