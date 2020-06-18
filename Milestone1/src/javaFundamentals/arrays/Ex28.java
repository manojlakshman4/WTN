package javaFundamentals.arrays;

public class Ex28 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int[] a=new int[n];
		int a6=0;
		int a7=0;
		for(int i=1;i<=n;i++) {
			a[i-1]=Integer.parseInt(args[i]);
			if(a[i-1]==6) {
				a6=i-1;
			}
			if(a[i-1]==7) {
				a7=i-1;
			}
		}
		int sum=0;
		if(a6<a7) {
			for(int i=0;i<a6;i++) {
				sum+=a[i];
			}
			for(int i=a7+1;i<n;i++) {
				sum+=a[i];
			}
		}
		else {
			for(int i=0;i<n;i++) {
				sum+=a[i];
			}
		}
		System.out.println(sum);
	}
}
