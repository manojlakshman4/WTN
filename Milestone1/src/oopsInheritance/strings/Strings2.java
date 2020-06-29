package oopsInheritance.strings;

import java.util.*;

public class Strings2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s1=scan.next();
		String s2=scan.next();
		String s="";
		int l1=s1.length();
		int l2=s2.length();
		if(l1==0||l2==0){
			s=s1.concat(s2);
		}
		else if(l1>=l2){
		    if(s1.substring(l1-1,l1).equals(s2.substring(0,1))){
		    	s=s1.concat(s2.substring(1,l2));
		    }
		    else{
		    	s=s1.concat(" ").concat(s2);
		    }
		}
		else{
		    if(s1.substring(l1-1,l1).equals(s2.substring(0,1))){
		    	s=s1.substring(0,l1-1).concat(s2);
		    }
		    else{
		    	s=s1.concat(" ").concat(s2);
		    }
		}
		System.out.println(s.toLowerCase());
	}
}
