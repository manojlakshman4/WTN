package com.wipro.numbers;

public class Nums12 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int c=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				c++;
			}
		}
		System.out.println(c);
	}
}
