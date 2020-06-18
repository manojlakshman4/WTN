package patterns;

public class Pattern11 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(j+1+" ");
			}
			System.out.println();
		}
	}
}
