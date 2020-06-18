package javaFundamentals.arrays;

public class Ex32 {
	public static void main(String[] args) {
		int[] a=new int[3];
		int[] b=new int[3];
		int[] c=new int[2];
		for(int i=0;i<3;i++) {
			a[i]=Integer.parseInt(args[i]);
			b[i]=Integer.parseInt(args[i+3]);
		}
		c[0]=a[1];
		c[1]=b[1];
		for(int i=0;i<2;i++) {
			System.out.print(c[i]+" ");
		}
	}
}
