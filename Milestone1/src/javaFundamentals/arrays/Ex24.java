package javaFundamentals.arrays;

public class Ex24 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int[] a=new int[n];
		for(int i=1;i<=n;i++) {
			a[i-1]=Integer.parseInt(args[i]);
		}
		for(int i=0;i<n;i++) {
			System.out.print((char)a[i]+" ");
		}
	}
}
