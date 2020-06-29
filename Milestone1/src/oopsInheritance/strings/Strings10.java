package oopsInheritance.strings;

import java.util.*;

public class Strings10 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		int n=scan.nextInt();
		int l=s.length();
		String S="";
		for(int i=0;i<n;i++) {
			S=S.concat(s.substring(l-n,l));
		}
		System.out.println(S);
	}
}
