package abstractionPackages.exceptionHandling;

import java.util.*;

public class Exception1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int l=sc.nextInt();
		System.out.println("Enter the elements in the array");
		int[] a=new int[l];
		try {
			for(int i=0;i<l;i++) {
				a[i]=sc.nextInt();
			}
			System.out.println("Enter the index of the array element you want to access");
			int ind=sc.nextInt();
			System.out.println("The array element at index "+ind+" = "+a[ind]);
			System.out.println("The array element successfully accessed");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
