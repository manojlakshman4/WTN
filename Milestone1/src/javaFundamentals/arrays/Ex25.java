package javaFundamentals.arrays;

public class Ex25 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int[] a=new int[n];
		int min1=100;
		int min2=100;
		int max1=0;
		int max2=0;
		for(int i=1;i<=n;i++) {
			a[i-1]=Integer.parseInt(args[i]);
			if(a[i-1]<min1) {
				min2=min1;
				min1=a[i-1];
			}
			else if(a[i-1]<min2) {
				min2=a[i-1];
			}
			if(a[i-1]>max1) {
				max2=max1;
				max1=a[i-1];
			}
			else if(a[i-1]>max2) {
				max2=a[i-1];
			}
		}
		System.out.println("Maximums are "+max1+" "+max2);
		System.out.println("Minimums are "+min1+" "+min2);
	}
}
