package javaFundamentals.arrays;

public class Ex30 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int[] a=new int[n];
		for(int i=1;i<=n;i++) {
			a[i-1]=Integer.parseInt(args[i]);
		}
		for(int i=0;i<n;i++) {
			if(a[i]%2!=0) {
				for(int j=i+1;j<n;j++) {
					if(a[j]%2==0) {
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			System.out.print(a[i]+" ");
		}
	}
}
