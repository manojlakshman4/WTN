package patterns;

public class Pattern20 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print("  ");
			}
			for(int j=i;j>=0;j--) {
				System.out.print(j+1+" ");
			}
			System.out.println();
		}
	}
}
