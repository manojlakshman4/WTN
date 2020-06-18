package javaFundamentals.arrays;

public class Ex33 {
	public static void main(String[] args) {
		if(args.length!=4) {
			System.out.println("Please enter 4 integer numbers");
		}
		else {
			int[][] a=new int[2][2];
			int k=0;
			for(int i=0;i<2;i++) {
				for(int j=0;j<2;j++) {
					a[i][j]=Integer.parseInt(args[k]);
					k++;
				}
			}
			int j=0;
			for(int i=0;i<2;i++) {
				if(i==0) {
					int temp=a[i][j];
					a[i][j]=a[i^1][j^1];
					a[i^1][j^1]=temp;
				}
				else {
					int temp=a[i][j];
					a[i][j]=a[j][i];
					a[j][i]=temp;
				}
			}
			for(int i=0;i<2;i++) {
				for(int l=0;l<2;l++) {
					System.out.print(a[i][l]+" ");
				}
				System.out.println();
			}
		}
	}
}
