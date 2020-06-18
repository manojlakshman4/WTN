package javaFundamentals.arrays;

public class Ex31 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int[] a=new int[n];
		int c=0;
		for(int i=1;i<=n;i++) {
			a[i-1]=Integer.parseInt(args[i]);
			if(a[i-1]!=1&&a[i-1]!=4) {
				c++;
			}
		}
		if(c==0) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
}
