package javaFundamentals.arrays;

public class Ex22 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int[] a=new int[n];
		int min=Integer.parseInt(args[1]);
		int max=min;
		for(int i=1;i<=n;i++) {
			a[i-1]=Integer.parseInt(args[i]);
			if(min>a[i-1]) {
				min=a[i-1];
			}
			if(max<a[i-1]) {
				max=a[i-1];
			}
		}
		System.out.println("Maximum is "+max);
		System.out.println("Minimum is "+min);
	}
}
