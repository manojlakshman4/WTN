package javaFundamentals.arrays;

public class Ex27 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int[] a=new int[n];
		for(int i=1;i<=n;i++) {
			a[i-1]=Integer.parseInt(args[i]);
		}
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[j]==a[i]) {
					a[j]=-1;
				}
			}
		}
		for(int i=0;i<n;i++) {
			if(a[i]>=0) {
				System.out.print(a[i]+" ");
			}
		}
	}
}
