package patterns;

public class Pattern21 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int k=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print("  ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}
}
