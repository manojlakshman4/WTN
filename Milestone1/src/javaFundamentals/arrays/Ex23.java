package javaFundamentals.arrays;

public class Ex23 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int[] a=new int[n];
		for(int i=1;i<=n;i++) {
			a[i-1]=Integer.parseInt(args[i]);
		}
		int search=Integer.parseInt(args[n+1]);
		int c=0,d=0;
		for(int i=1;i<n;i++) {
			if(a[i]==search) {
				c++;
				d=i;
				break;
			}
		}
		if(c!=0) {
			System.out.print(d);
		}
		else {
			System.out.println("-1");
		}
	}
}
