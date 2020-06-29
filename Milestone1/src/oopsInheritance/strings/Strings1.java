package oopsInheritance.strings;

import java.util.*;

public class Strings1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		int l=s.length();
		int c=0;
		for(int i=0;i<l/2;i++) {
			if(s.charAt(i)!=s.charAt(l-i-1)) {
				c++;
				break;
			}
		}
		if(c>0) {
			System.out.println("No");
		}
		else {
			System.out.println("Yes");
		}
	}
}
