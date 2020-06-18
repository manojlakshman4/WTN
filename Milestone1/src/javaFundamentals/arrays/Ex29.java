package javaFundamentals.arrays;

public class Ex29 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int[] a=new int[n];
		for(int i=1;i<=n;i++) {
			a[i-1]=Integer.parseInt(args[i]);
		}
		for(int i=0;i<n;i++) {
			if(a[i]==10) {
				for(int j=i;j<n-1;j++) {
					a[j]=a[j+1];
				}
				a[n-1]=0;
			}
			System.out.print(a[i]+" ");
		}
	}
}
